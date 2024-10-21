#include <stdio.h>

int main() {
    int a, b, c;
    printf("Enter the three sides of the triangle: ");
    scanf("%d %d %d", &a, &b, &c);

    if(a == b && b == c) {
        printf("The triangle is equilateral.\n");
    }
    else if(a == b || b == c || c == a) {
        printf("The triangle is isosceles.\n");
    }
    else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b) {
        printf("The triangle is a right angled triangle.\n");
    }
    else {
        printf("The triangle is scalene.\n");
    }

    return 0;
}
