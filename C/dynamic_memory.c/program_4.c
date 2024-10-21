// Allocate memory to store first 5 odd numbers then re allocate it to store first 6 even no.s
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int*ptr;
    ptr = (int*)calloc(5,sizeof(int));
    printf("Enter 1st 5 odd numbers\n");
    for(int i = 0; i<5;i++)
    {
        scanf("%d",&ptr[i]);
    }
    printf("First 5 odd numbers are\n");
    for(int i = 0;i<5;i++)
    {
        printf("%d\n",ptr[i]);
    }
    ptr=realloc(ptr,6);
    printf("Enter 1st 6 even numbers \n");

    for(int i = 0; i<6;i++)
    {
        scanf("%d",&ptr[i]);
    }
    printf("First 6 even numbers are\n");
    for(int i = 0;i<6;i++)
    {
        printf("%d\n",ptr[i]);
    }
    free(ptr);
}