#include <stdio.h>
#define max 30

int main()
{
    int i, j, n, bt[max], wt[max], tat[max];
    float awt = 0, atat = 0;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    printf("Enter the burst time of the processes:\n");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &bt[i]);
    }

    for (i = 0; i < n; i++)
    {
        wt[i] = 0;
        tat[i] = 0;
        for (j = 0; j < i; j++)
        {
            wt[i] = wt[i] + bt[j];
        }
        tat[i] = wt[i] + bt[i];
        awt = awt + wt[i];
        atat = atat + tat[i];
    }

    printf("Process\tBurst Time\tWaiting Time\tTurnaround Time\n");
    for (i = 0; i < n; i++)
    {
        printf("%d\t%d\t\t%d\t\t%d\n", i + 1, bt[i], wt[i], tat[i]);
    }

    awt = awt / n;
    atat = atat / n;

    printf("Average Waiting Time: %f\n", awt);
    printf("Average Turnaround Time: %f\n", atat);

    return 0;
}
