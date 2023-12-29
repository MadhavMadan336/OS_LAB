#include <stdio.h>
#include <stdlib.h>
#include <Windows.h>

#define N 5 // Number of philosophers

#define LEFT (philosopher_number + N - 1) % N
#define RIGHT (philosopher_number + 1) % N

#define THINKING 0
#define HUNGRY 1
#define EATING 2

HANDLE mutex;
HANDLE semaphores[N];
int state[N];

void test(int philosopher_number) {
    if (state[philosopher_number] == HUNGRY &&
        state[LEFT] != EATING &&
        state[RIGHT] != EATING) {
        state[philosopher_number] = EATING;
        printf("Philosopher %d picks up forks %d and %d and starts eating\n",
               philosopher_number + 1, LEFT + 1, philosopher_number + 1);
        ReleaseSemaphore(semaphores[philosopher_number], 1, NULL);
    }
}

void take_forks(int philosopher_number) {
    WaitForSingleObject(mutex, INFINITE);
    state[philosopher_number] = HUNGRY;
    printf("Philosopher %d is hungry\n", philosopher_number + 1);
    test(philosopher_number);
    ReleaseMutex(mutex);
    WaitForSingleObject(semaphores[philosopher_number], INFINITE);
    Sleep(2000); // Simulate eating time
}

void put_forks(int philosopher_number) {
    WaitForSingleObject(mutex, INFINITE);
    state[philosopher_number] = THINKING;
    printf("Philosopher %d puts down forks %d and %d and starts thinking\n",
           philosopher_number + 1, LEFT + 1, philosopher_number + 1);
    test(LEFT);
    test(RIGHT);
    ReleaseMutex(mutex);
}

DWORD WINAPI philosopher_thread(LPVOID arg) {
    int philosopher_number = *((int *)arg);
    free(arg);

    while (1) {
        Sleep(1000); // Simulate thinking time
        take_forks(philosopher_number);
        Sleep(1000); // Time between eating and thinking
        put_forks(philosopher_number);
        // Add exit condition here if needed
    }

    return 0;
}

int main() {
    mutex = CreateMutex(NULL, FALSE, NULL);

    for (int i = 0; i < N; i++) {
        state[i] = THINKING;
        semaphores[i] = CreateSemaphore(NULL, 0, 1, NULL);
    }

    HANDLE philosophers[N];

    for (int i = 0; i < N; i++) {
        int *arg = malloc(sizeof(int));
        if (arg == NULL) {
            printf("Memory allocation failed\n");
            return 1;
        }
        *arg = i;

        philosophers[i] = CreateThread(NULL, 0, philosopher_thread, arg, 0, NULL);
        printf("Philosopher %d is thinking\n", i + 1);
    }

    // Allow philosophers to run for some time
    Sleep(15000);

    // Clean up
    CloseHandle(mutex);
    for (int i = 0; i < N; i++) {
        CloseHandle(semaphores[i]);
        // Properly close threads here using an exit mechanism
        // (For the controlled exit, we can introduce a flag in the while loop of philosopher_thread)
        // TerminateThread(philosophers[i], 0); // Avoid using TerminateThread in production code
    }

    return 0;
}
