//بسم الله 
#include<stdio.h>
#include<math.h>
void main()
{
    float a,b,c,d,x1,x2;
    printf("Enter the values of a, b, c respectively\n");
    scanf("%f%f%f",&a,&b,&c);
    d = (b*b)-(4*a*c);

    if(d==0)
    {
        printf("Roots are real and equal\n");
        x1 = -b/(2*a);
        x2 = x1;
        printf("x1 = %f and x2 = %f",x1,x2);
    }
    else if(d>0)
    {
        printf("Roots are real and unequal\n");
        x1 = (-b+sqrt(d))/(2*a);
        x2 = (-b-sqrt(d))/(2*a);
        printf("x1 = %f and x2 = %f",x1,x2);
    }
    else
    {
        printf("Roots are imaginery\n");
    }
}