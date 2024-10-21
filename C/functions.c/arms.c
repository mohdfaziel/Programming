// wap to check weather a number is an armstrong number or not between the range of 1 to 1000
#include<stdio.h>
#include<math.h>
int arms(int n)
{
int arms=0,remd;
    while(n>1)
    { 
        remd = n%10;
         arms += remd*remd*remd;
         n = n/10;
    }
    if(arms==n){
        printf("Entered number is an armstrong number\n");
    }else{
        printf("Entered number is not an armstrong number\n");
    }
    }
    void main()
    {
        int num;
        printf("Enter any number between 1 to 1000\n");
        scanf("%d",&num);
        arms(num);
    }

