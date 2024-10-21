#include<stdio.h>
int gcd(int n,int m)
{
    int result;
    if(m == 0)
    return n;
    else
    {
        result = n%m;
        return gcd(m,result);
    }
}
void main()
{
    int n,m;
    printf("Enter two numbers\n");
    scanf("%d%d",&n,&m);
    printf("GCD of %d and %d is: %d\n",n,m,gcd(n,m));
}