#include<stdio.h>
#include<stdlib.h>
int reverse_digit(int n)
{
    static int reverse=0; //IMPORTANT CONCEPT
    if(n==0)
    {
        return 0;
    }
    else{
        int remainder = n%10;
        reverse = reverse*10 + remainder;
        reverse_digit(n/10);
    }
    return reverse;
}
void main()
{
    int n;
    printf("Enter the number\n");
    scanf("%d",&n);
    printf("Reverse of the number %d is %d\n",n,reverse_digit(n));
}