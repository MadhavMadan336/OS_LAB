#include <stdio.h>
#include <windows.h>

#define BUFFER_SIZE 5

HANDLE empty, full, mutex;
int buffer[BUFFER_SIZE];
int in = 0, out = 0;

DWORD WINAPI producer(LPVOID arg) {
    int item = 1;
    while (1) {
        WaitForSingleObject(empty, INFINITE);
        WaitForSingleObject(mutex, INFINITE);
        buffer[in] = item;
        printf("Produced: %d\n", item);
        in = (in + 1) % BUFFER_SIZE;
        item++;
        ReleaseMutex(mutex);
        ReleaseSemaphore(full, 1, NULL);
    }
}

DWORD WINAPI consumer(LPVOID arg) {
    int item;
    while (1) {
        WaitForSingleObject(full, INFINITE);
        WaitForSingleObject(mutex, INFINITE);
        item = buffer[out];
        printf("Consumed: %d\n", item);
        out = (out + 1) % BUFFER_SIZE;
        ReleaseMutex(mutex);
        ReleaseSemaphore(empty, 1, NULL);
    }
}

int main() {
    HANDLE producer_thread, consumer_thread;

    empty = CreateSemaphore(NULL, BUFFER_SIZE, BUFFER_SIZE, NULL);
    full = CreateSemaphore(NULL, 0, BUFFER_SIZE, NULL);
    mutex = CreateMutex(NULL, FALSE, NULL);

    producer_thread = CreateThread(NULL, 0, producer, NULL, 0, NULL);
    consumer_thread = CreateThread(NULL, 0, consumer, NULL, 0, NULL);

    WaitForSingleObject(producer_thread, INFINITE);
    WaitForSingleObject(consumer_thread, INFINITE);

    CloseHandle(empty);
    CloseHandle(full);
    CloseHandle(mutex);

    return 0;
}
