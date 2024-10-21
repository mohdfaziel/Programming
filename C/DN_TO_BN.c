#include<stdio.h>
#include<conio.h>
void main()
{
    int dn,bn=0,parity,power=1; // power of 10
    printf("Enter any decimal number\n");
    scanf("%d",&dn);
    while(dn>0)
    {
        parity = dn%2;
        bn += parity*power;
        power *= 10;
        dn /=2;
    }
    printf("%d",bn);
}