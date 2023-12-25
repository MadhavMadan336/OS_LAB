#include <stdio.h>

// Number of processes
#define P 5

// Number of resources
#define R 3

// Function to check if the process can be allocated resources
int isSafe(int processes[], int avail[], int maxm[][R], int need[][R]) {
    int finish[P] = {0}; // To check if process is finished or not
    int safeSeq[P]; // To store safe sequence
    int work[R]; // Available resources

    // Initialize work as available
    for (int i = 0; i < R; i++)
        work[i] = avail[i];

    // Find a process to execute
    int count = 0;
    while (count < P) {
        int found = 0;
        for (int p = 0; p < P; p++) {
            // Check if process is not finished
            if (finish[p] == 0) {
                // Check if process can get the required resources
                int j;
                for (j = 0; j < R; j++)
                    if (need[p][j] > work[j])
                        break;

                // If all resources are available, allocate resources to process
                if (j == R) {
                    for (int k = 0; k < R; k++)
                        work[k] += maxm[p][k];

                    safeSeq[count++] = p;
                    finish[p] = 1;
                    found = 1;
                }
            }
        }
        // If no such process is found
        if (found == 0) {
            printf("System is not in safe state");
            return 0;
        }
    }

    // If system is in safe state, print safe sequence
    printf("System is in safe state.\nSafe sequence is: ");
    for (int i = 0; i < P; i++)
        printf("%d ", safeSeq[i]);
    return 1;
}

int main() {
    // Available resources
    int avail[R] = {3, 3, 2};

    // Maximum resources that can be allocated to processes
    int maxm[P][R] = {
        {7, 5, 3},
        {3, 2, 2},
        {9, 0, 2},
        {2, 2, 2},
        {4, 3, 3}
    };

    // Resources currently allocated to processes
    int alloc[P][R] = {
        {0, 1, 0},
        {2, 0, 0},
        {3, 0, 2},
        {2, 1, 1},
        {0, 0, 2}
    };

    // Need of each process
    int need[P][R];
    for (int i = 0; i < P; i++)
        for (int j = 0; j < R; j++)
            need[i][j] = maxm[i][j] - alloc[i][j];

    int processes[] = {0, 1, 2, 3, 4};
    isSafe(processes, avail, maxm, need);

    return 0;
}
