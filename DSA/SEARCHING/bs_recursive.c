#include<stdio.h>
#include<stdlib.h>
int binarysearch(int * arr,int beg,int end,int element)
{
    if(beg<=end)
    {
        int mid = (beg+end)/2;
        if(arr[mid]==element)
        {
            return mid;
        }
        else if(arr[mid]<element)
        {
            return binarysearch(arr,mid+1,end,element);
        }
        else
        {
            return binarysearch(arr,beg,mid-1,element);
        }
    }
    return -1;
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

    loc = binarysearch(arr,0,size-1,element);
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