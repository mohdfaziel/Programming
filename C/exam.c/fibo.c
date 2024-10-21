//بسم الله 
#include <stdio.h>

int main() {
    int a = 0, b = 1, c = 0;
    printf("Fibonacci series below 100:\n");
    while (c < 100) {
        printf("%d ", c);
        a = b;
        b = c;
        c = a + b;
    }
    printf("\n");
    return 0;
}
