#include<stdio.h>
#include<conio.h>
void main()
{
    int binaryNumber,unitNumber,decimalNumber=0,power=1;
    printf("Enter any binary number\n");
    scanf("%d",&binaryNumber);
    while(binaryNumber>0)
    {
        unitNumber = binaryNumber%10;
        decimalNumber += unitNumber*power;
        power*=2;
        binaryNumber/=10;
    }
    printf("%d",decimalNumber);
}  