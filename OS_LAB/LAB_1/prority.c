/*
implementation of prority based scheduling algorithm using array .
calculate . 
a. CT , TAT , 
b. execution order 
c. AWT ,ATAT 
*/
#include <stdio.h>

void swap(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main()
{
    int n;
    printf("Enter Number of Processes: ");
    scanf("%d", &n);

    // b is array for burst time, p for priority and index for process id
    int b[n], p[n], index[n], ct[n], wt[n], tat[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter Burst Time and Priority Value for Process %d: ", i + 1);
        scanf("%d %d", &b[i], &p[i]);
        index[i] = i + 1;
    }

    for (int i = 0; i < n; i++)
    {
        int highestPriority = p[i], m = i;

        for (int j = i; j < n; j++)
        {
            if (p[j] > highestPriority)
            {
                highestPriority = p[j];
                m = j;
            }
        }

        swap(&p[i], &p[m]);
        swap(&b[i], &b[m]);
        swap(&index[i], &index[m]);
    }

    int t = 0;

    for (int i = 0; i < n; i++)
    {
        ct[i] = t + b[i];
        t = ct[i];
    }

    float totalWaitTime = 0, totalTurnaroundTime = 0;

    printf("\nProcess Id     Burst Time    Completion Time    Turnaround Time    Wait Time\n");

    for (int i = 0; i < n; i++)
    {
        tat[i] = ct[i];
        wt[i] = tat[i] - b[i];
        totalWaitTime += wt[i];
        totalTurnaroundTime += tat[i];

        printf("P%d\t\t%d\t\t%d\t\t\t%d\t\t%d\n", index[i], b[i], ct[i], tat[i], wt[i]);
    }

    float averageWaitTime = (float)totalWaitTime / n;
    float averageTurnaroundTime = (float)totalTurnaroundTime / n;

    printf("\nAverage Waiting Time: %.2f", averageWaitTime);
    printf("\nAverage Turnaround Time: %.2f", averageTurnaroundTime);

    return 0;
}
