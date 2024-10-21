#include <stdio.h>

int factorial(int n);
int sum_of_factorials(int n);

int main() {
    int n;

    printf("Enter the value of n: ");
    scanf("%d", &n);

    printf("The sum of the series 1!, 2!, 3!, ..., %d! is %d\n", n, sum_of_factorials(n));

    return 0;
}

int factorial(int n) {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

int sum_of_factorials(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += factorial(i);
    }
    return sum;
}
