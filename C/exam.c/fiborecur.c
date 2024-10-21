#include <stdio.h>

int fibonacci(int n);
int fibonacci_sum(int n);

int main() {
    int n;

    printf("Enter the number of terms in the Fibonacci series: ");
    scanf("%d", &n);

    printf("The sum of the first %d terms of the Fibonacci series is %d\n", n, fibonacci_sum(n));

    return 0;
}

int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
}

int fibonacci_sum(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += fibonacci(i);
    }
    return sum;
}
