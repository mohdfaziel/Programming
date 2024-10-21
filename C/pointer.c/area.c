// print area of a square using pointer and functions
#include<stdio.h>
void area(int *x);
void main(){
    int s; 
   
    printf("Enter the side of the square\n");
     scanf("%d",&s);
     area(&s);
}
void area(int *x)
{
    int area = (*x * *x);
    printf("Area of the square with side %d is %d",*x,area);
}