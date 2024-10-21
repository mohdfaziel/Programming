// reading data from the file test.txt
#include<stdio.h>
void main()
{
    FILE* fptr;
    fptr = fopen("test.txt","r");
    char ch;
    // fscanf(fptr,"%c",&ch);
    // printf("1st character = %c \n",ch);
    // fscanf(fptr,"%c",&ch);
    // printf("2nd character = %c \n",ch);
    // fscanf(fptr,"%c",&ch);
    // printf("3rd character = %c \n",ch);
    
    // this can also be done through
   printf("%c",fgetc(fptr));
    printf("%c",fgetc(fptr));
     printf("%c",fgetc(fptr));
      printf("%c",fgetc(fptr));
       printf("%c",fgetc(fptr));
    
   
    
}
