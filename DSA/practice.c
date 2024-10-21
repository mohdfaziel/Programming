#include <stdio.h>

typedef struct {
    int pid, burst_time, waiting_time, turnaround_time;
} Process;

void sortByBurstTime(Process p[], int n) {
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (p[j].burst_time > p[j + 1].burst_time) {
                Process temp = p[j];
                p[j] = p[j + 1];
                p[j + 1] = temp;
            }
        }
    }
}

void calculateTimes(Process p[], int n) {
    p[0].waiting_time = 0;
    for (int i = 1; i < n; i++)
        p[i].waiting_time = p[i - 1].waiting_time + p[i - 1].burst_time;
    
    for (int i = 0; i < n; i++)
        p[i].turnaround_time = p[i].waiting_time + p[i].burst_time;
}

void printAvgTimes(Process p[], int n) {
    int total_wt = 0, total_tt = 0;
    printf("PID\tBurst\tWaiting\tTurnaround\n");
    for (int i = 0; i < n; i++) {
        total_wt += p[i].waiting_time;
        total_tt += p[i].turnaround_time;
        printf("%d\t%d\t%d\t%d\n", p[i].pid, p[i].burst_time, p[i].waiting_time, p[i].turnaround_time);
    }
    printf("Avg waiting time: %.2f\n", (float)total_wt / n);
    printf("Avg turnaround time: %.2f\n", (float)total_tt / n);
}

int main() {
    int n;
    printf("Enter number of processes: ");
    scanf("%d", &n);
    
    Process p[n];
    for (int i = 0; i < n; i++) {
        p[i].pid = i + 1;
        printf("Enter burst time for process %d: ", p[i].pid);
        scanf("%d", &p[i].burst_time);
    }
    
    sortByBurstTime(p, n);
    calculateTimes(p, n);
    printAvgTimes(p, n);
    
    return 0;
}
