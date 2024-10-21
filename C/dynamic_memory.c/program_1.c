// wap to allocate memory of size n, store and print values using malloc
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int n;
    int*ptr;
    printf("Enter the size of the memory\n");
    scanf("%d",&n);
    ptr = (int*)malloc(n*sizeof(int));
    if(ptr==NULL)
    {
        printf("Memory not allocated\n");
    }
    else
    {
        for(int i = 0;i<n;i++)
        {
            printf("Enter element %d :",i+1);
            scanf("%d",&ptr[i]);
        }
    }
     for(int i = 0;i<n;i++)
        {
            printf("Element %d is %d\n",i+1,ptr[i]);
        }
        free(ptr);
}