//بسم الله 
#include <stdio.h>

void calculate(float r, float *a, float *c) {
    *a = 3.14 * r * r;
    *c = 2 * 3.14 * r;
}

int main() {
    float radius, area, circumference;

    printf("Enter the radius of the circle: ");
    scanf("%f", &radius);

    calculate(radius, &area, &circumference);

    printf("Area of the circle = %f\n", area);
    printf("Circumference of the circle = %f\n", circumference);

    return 0;
}
