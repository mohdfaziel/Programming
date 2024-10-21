#include<stdio.h>
int fact(int n)
{
    if(n>1)
    {
        return n*fact(n-1);
    }
}
void main()
{
    int num;
    printf("Enter any number\n");
    scanf("%d",&num);
    printf("Factorial of %d is %d",num,fact(num));
}