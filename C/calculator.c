#include<stdio.h>
#include<conio.h>
void main(){
    float a,b;
    char operator;
    printf("Enter operator\n");
    scanf("%c",&operator);
    printf("Enter any two numbers\n");
    scanf("%f%f",&a,&b);
    switch(operator){
        case '+' : printf("%f",a+b);
        break;
        case '-' : printf("%f",a-b);
        break;
        case '*' : printf("%f",a*b);
        break;
        case '/' : printf("%f",a/b);
        break;
        default : printf("invalid operator");
    }

}