#include<stdio.h>
#include<stdlib.h>
int linearSearch(int * arr,int value)
{
    int size = sizeof(arr)/sizeof(int);
    for(int i = 0;i<size;i++)
    {
        if(arr[i]==value)
        {
            return i;
        }
    }
    return -1;
}
void main()
{
    int size;
    int value;
    printf("Enter the size of the array\n");
    scanf("%d",&size);
    int * arr = (int*)malloc(size*sizeof(int));
    printf("Enter the elements of the array\n");
    for(int i = 0; i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the value to be searched\n");
    scanf("%d",&value);
    int result = linearSearch(arr,value);
    if(result!=-1)
    {
        printf("Element present at index %d",result);
    }else
    {
        printf("Element not found");
    }
}