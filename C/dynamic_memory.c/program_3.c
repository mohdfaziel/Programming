// Allocate memory for five numbers the dynamically reallocate it to store eight numbers
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int*ptr;
    ptr = (int*)calloc(5,sizeof(int));
    printf("Enter 5 numbers\n");
    for(int i = 0; i<5;i++)
    {
        scanf("%d",&ptr[i]);
    }
    ptr=realloc(ptr,8);
    printf("Enter 8 numbers\n");
    for(int i = 0; i<8;i++)
    {
        scanf("%d",&ptr[i]);
    }
    free(ptr);
}