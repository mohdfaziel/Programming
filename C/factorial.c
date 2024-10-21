#include<stdio.h>
#include<conio.h>
void main(){
    int f=1  ,n;
    printf("Enter any number\n");
    scanf("%d",&n);
    for(int i = 1;i<=n;i++){
        f= f*i;
    }
        printf("factorial of the entered number is %d",f);

    }