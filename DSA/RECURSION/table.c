#include<stdio.h>
int table(int a,int i)
{
    if(i==1)
    {
        return a;
    }
    else
    {
        return (table(a,i-1) + a);
    }
}
void main()
{
    int a;
    printf("Enter the number of which you want to print the table\n");
    scanf("%d",&a);
    for(int i = 1;i<=10;i++)
    {
        printf("%d * %d = %d\n",a,i,table(a,i));
    }
}

