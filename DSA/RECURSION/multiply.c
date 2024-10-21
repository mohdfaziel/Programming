#include<stdio.h>
int multiply(int n,int m)
{
    if(n==0 || m==0)
    {
        return 0;
    }
    else if(m==1)
    {
        return n;
    }
    else
    {
        return (multiply(n,m-1)+n);
    }
}
void main()
{
    int n,m;
    printf("Enter two numbers\n");
    scanf("%d%d",&n,&m);
    printf("product of these two numbers is %d\n",multiply(n,m));
}