// print table of a number using functions
#include<stdio.h>
void table(int x);
void main(){
    int num;
    printf("Enter any number\n");
    scanf("%d",&num);
    table(num);
}
void table(int x){
for(int i = 1; i<=10; i++)
{
    printf("%d\n",x*i);
}
}