//wap to replace 2 numbers from a file with their sum
//بسم الله 
#include<stdio.h>
void main()
{
    FILE *fptr;
    fptr = fopen("test.txt","r");
    int a,b;
    fscanf(fptr,"%d",&a);
    fscanf(fptr,"%d",&b);
    int c = a+b;
    fclose(fptr);

    fptr = fopen("test.txt","w");
    fprintf(fptr,"%d",c);
    fclose(fptr);
}