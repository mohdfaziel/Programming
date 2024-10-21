#include<stdio.h>
void hello(int count);
void main(){
    
    int num;
    printf("Enter the number of times you want to print hello\n");
    scanf("%d",&num);
    hello(num);
}
void hello(int count){
    if(count!=0){ // here 0 is the base case
        printf("hello\n");
        hello(count - 1);
    }
}