// wAP TO ALLOCATE MEMORY FOR N INTEGER AND PRINT THE DEFAULT VALUES USING CALLOC()
#include<stdio.h>
#include<stdlib.h>
void main()
{
    int n;
    int*ptr;
    printf("Enter no of elements \n");
    scanf("%d",&n);
    ptr = (int*)calloc(n,sizeof(int));
    if(ptr==NULL)
    {
        printf("Memory not allocated\n");
    }
    else
    {
         for(int i = 0;i<n;i++)
        {
            printf("Element %d is %d\n",i+1,ptr[i]);
        }
    }
        free(ptr);
}