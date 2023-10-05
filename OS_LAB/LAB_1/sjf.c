/*
implementation of sjf scheduling algorithm using array .
calculate . 
a. CT , TAT , 
b. execution order 
c. AWT ,ATAT 
*/
#include <stdio.h>
#define max 30

int main()
{
    int i, j, n, t, p[max], bt[max], at[max], wt[max], tat[max], ct[max], temp[max];
    float awt = 0, atat = 0;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    printf("Enter the process numbers: ");
    for (i = 0; i < n; i++)
    {
        scanf("%d", &p[i]);
    }
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

    for (i = 0; i < n; i++)
    {
        for (j = 0; j < n - i - 1; j++)
        {
            if (at[j] > at[j + 1])
            {
                t = at[j];
                at[j] = at[j + 1];
                at[j + 1] = t;
                t = bt[j];
                bt[j] = bt[j + 1];
                bt[j + 1] = t;
                t = p[j];
                p[j] = p[j + 1];
                p[j + 1] = t;
            }
        }
    }

    int currentTime = at[0];
    printf("Execution Order: ");
    for (i = 0; i < n; i++)
    {
        int shortestIndex = i;
        for (j = i + 1; j < n; j++)
        {
            if (bt[j] < bt[shortestIndex] && at[j] <= currentTime)
            {
                shortestIndex = j;
            }
        }
        temp[i] = p[shortestIndex];
        p[shortestIndex] = p[i];
        p[i] = temp[i];

        temp[i] = at[shortestIndex];
        at[shortestIndex] = at[i];
        at[i] = temp[i];

        temp[i] = bt[shortestIndex];
        bt[shortestIndex] = bt[i];
        bt[i] = temp[i];
        ct[i] = currentTime + bt[i];
        currentTime = ct[i];

        printf("%d", p[i]);
        if (i != n - 1)
            printf(" -> ");
    }
    printf("\n");

    printf("Process\tBurst Time\tArrival Time\tWaiting Time\tTurnaround Time\tCompletion Time\n");
    for (i = 0; i < n; i++)
    {
        wt[i] = ct[i] - at[i] - bt[i];
        tat[i] = ct[i] - at[i];
        awt += wt[i];
        atat += tat[i];
        printf("%d\t%d\t\t%d\t\t%d\t\t%d\t\t%d\n", p[i], bt[i], at[i], wt[i], tat[i], ct[i]);
    }
    awt /= n;
    atat /= n;
    printf("Average Waiting Time: %f\n", awt);
    printf("Average Turnaround Time: %f\n", atat);

    return 0;
}
