#include<stdio.h>
#include<stdlib.h>
int binarysearch(int * arr,int size,int element)
{
    int beg,mid,end,index=-1;
    beg = 0;
    end = size-1;
    while(beg<=end)
    {
    mid = (beg+end)/2;
    if(arr[mid]==element)
    {
       index = mid;
       return mid;
    }
    else if(arr[mid]<element)
    {
        beg = mid+1;
    }
    else
    {
        end= mid-1;
    }
    }
    return index;
}
void main()
{
    int size,element,loc;
    printf("Enter the size of the array\n");
    scanf("%d",&size);

    int * arr = (int*)malloc(size*sizeof(int));
    printf("Enter the elements of the array in sorted manner\n");
    for(int i = 0; i <size;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the element to be searched in the array\n");
    scanf("%d",&element);

    loc = binarysearch(arr,size,element);
    if(loc==-1)
    {
        printf("Element not found in the array\n");
    }
    else
    {
        printf("Element is present at the index %d\n",loc);
    }
    free(arr);
}