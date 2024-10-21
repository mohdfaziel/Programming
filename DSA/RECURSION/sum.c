#include<stdio.h>
#include<stdlib.h>
int sum_digit(int n)
{
    static int sum = 0; //IMPORTANT CONCEPT
    if(n==0)
    {
        return 0;
    }
    else{
        int remainder = n%10;
        sum = sum + remainder;
        sum_digit(n/10);
    }
    return sum;
}
void main()
{
    int n;
    printf("Enter the number\n");
    scanf("%d",&n);
    printf("sum of the number %d is %d\n",n,sum_digit(n));
}