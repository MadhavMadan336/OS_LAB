/*
implementation of round robin scheduling algorithm using array .
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
    printf("Enter Total Number of Processes:");
    scanf("%d", &n);
    int wait_time = 0, ta_time = 0, arr_time[n], burst_time[n], temp_burst_time[n], completion_time[n];
    int x = n;

    for (int i = 0; i < n; i++)
    {
        printf("Enter Details of Process %d \n", i + 1);
        printf("Arrival Time:  ");
        scanf("%d", &arr_time[i]);
        printf("Burst Time:   ");
        scanf("%d", &burst_time[i]);
        temp_burst_time[i] = burst_time[i];
    }

    int time_slot;
    printf("Enter Time Slot:");
    scanf("%d", &time_slot);

    int total = 0, counter = 0, i;

    printf("Process ID\tArrival Time\tBurst Time\t Completion Time\t Turnaround Time \t Waiting Time\n");
    int execution_order[n];
    int execution_index = 0;
    for (total = 0, i = 0; x != 0;)
    {
        if (temp_burst_time[i] <= time_slot && temp_burst_time[i] > 0)
        {
            total = total + temp_burst_time[i];
            temp_burst_time[i] = 0;
            counter = 1;
        }
        else if (temp_burst_time[i] > 0)
        {
            temp_burst_time[i] = temp_burst_time[i] - time_slot;
            total += time_slot;
        }
        if (temp_burst_time[i] == 0 && counter == 1)
        {
            x--;
            completion_time[i] = total;
            execution_order[execution_index++] = i + 1;
            printf("%d\t\t%d\t\t%d\t\t\t%d\t\t\t%d\t\t\t%d\n", i + 1, arr_time[i], burst_time[i],
                   completion_time[i], total - arr_time[i], total - arr_time[i] - burst_time[i]);
            wait_time = wait_time + total - arr_time[i] - burst_time[i];
            ta_time += total - arr_time[i];
            counter = 0;
        }
        if (i == n - 1)
        {
            i = 0;
        }
        else if (arr_time[i + 1] <= total)
        {
            i++;
        }
        else
        {
            i = 0;
        }
    }

    float average_wait_time = wait_time * 1.0 / n;
    float average_turnaround_time = ta_time * 1.0 / n;

    printf("\nAverage Waiting Time:%f", average_wait_time);
    printf("\nAvg Turnaround Time:%f", average_turnaround_time);

    // Print the order of execution
    printf("\nOrder of Execution:\n");
    for (int i = 0; i < n; i++)
    {
        printf("P%d -> ", execution_order[i]);
    }
    printf("\n");

    return 0;
}
