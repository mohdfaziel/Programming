#include<stdio.h>
#include<conio.h>
void main() {
    int sum,min,max,num,remd,armstrong;
    printf("Enter the range between which you want to find armstrong numbers\n");
    scanf("%d%d",&min,&max);
    printf("Armstrong numbers between given range are\n");
    for(int i = min; i<=max; i++)
    {
        sum=0;
        num=i;
        armstrong = num;
        while(num!=0)
        {
            remd = num%10;
            sum = sum+remd*remd*remd;
            num = num/10;
        }
        if(armstrong==sum)
        {
            printf("%d\n",sum);
        }
    }
}