//بسم الله الرحمن الرحيم
// wap to read 5 integers from a file
#include<stdio.h>
void main()
{
    FILE*fptr;
    fptr = fopen("test.txt","r");
    int data;
    fscanf(fptr,"%d",&data);
    printf("%d\n",data);
    fscanf(fptr,"%d",&data);
    printf("%d\n",data);
    fscanf(fptr,"%d",&data);
    printf("%d\n",data);
    fscanf(fptr,"%d",&data);
    printf("%d\n",data);
    fscanf(fptr,"%d",&data);
    printf("%d\n",data);
fclose(fptr);

       
}