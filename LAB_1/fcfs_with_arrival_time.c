#include <stdio.h>
#define max 30

int main()
{
    int i, j, n, bt[max], at[max], wt[max], tat[max], temp[max], ct[max], rt[max];
    float awt = 0, atat = 0;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    printf("Enter the burst time of the processes: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &bt[i]);
    }
    printf("Enter the arrival time of the processes: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &at[i]);
    }
    temp[0] = 0;
    printf("Process\tBurst Time\tArrival time\tWaiting Time\tTurnaround Time\tCompletion Time\tResponse Time\n");
    for (i = 0; i < n; i++)
    {
        wt[i] = 0;
        tat[i] = 0;
        ct[i] = 0;  // Initialize completion time
        rt[i] = -1; // Initialize response time to -1 (not yet started)
    }

    int currentTime = 0;
    int completed = 0;
    int executionOrder[max]; // To store the execution order

    while (completed < n)
    {
        int shortestIndex = -1;
        int shortestBurst = max;

        for (i = 0; i < n; i++)
        {
            if (at[i] <= currentTime && rt[i] == -1 && bt[i] < shortestBurst)
            {
                shortestIndex = i;
                shortestBurst = bt[i];
            }
        }

        if (shortestIndex == -1)
        {
            currentTime++;
        }
        else
        {
            rt[shortestIndex] = currentTime - at[shortestIndex];
            currentTime += bt[shortestIndex];
            ct[shortestIndex] = currentTime;
            tat[shortestIndex] = ct[shortestIndex] - at[shortestIndex];
            wt[shortestIndex] = tat[shortestIndex] - bt[shortestIndex];
            awt += wt[shortestIndex];
            atat += tat[shortestIndex];
            executionOrder[completed] = shortestIndex; // Store the executed process
            completed++;
        }
    }

    // Print the execution order
    printf("Execution Order: ");
    for (i = 0; i < n; i++)
    {
        printf("P%d", executionOrder[i] + 1);
        if (i != n - 1)
            printf(" -> ");
    }
    printf("\n");

    for (i = 0; i < n; i++)
    {
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", i + 1, bt[i], at[i], wt[i], tat[i], ct[i], rt[i]);
    }

    awt = awt / n;
    atat = atat / n;
    printf("Average Waiting Time: %f\n", awt);
    printf("Average Turnaround Time: %f\n", atat);

    return 0;
}
