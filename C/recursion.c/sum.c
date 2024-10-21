// print sum of 1st n natural numbers using recursion
#include<stdio.h>
int sum(int n);
void main(){
    int num;
    printf("Enter any number\n");
    scanf("%d",&num);
    printf("%d",sum(num));
}
int sum(int n){
    if(n>0){
        return n + sum(n-1);
    }
}
