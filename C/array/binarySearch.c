// for binary search array must be sorted
#include<stdio.h>
void binarySearch(int arr[],int size,int element)
{
     int low=0,mid,end=(size-1),ans=-1;
    while(low<=end)
    {
        mid = (low + end)/2;
        if(arr[mid]==element)
        {
            ans = mid;
            break;
        }
        else if(arr[mid]<element)
        {
            low = mid;
        }
        else
        {
            end = mid;
        }
    }
    if(ans<0) 
    {
        printf("Element isn't present here\n");
    }
    else
    {
        printf("Element is present at the index %d",ans);
    }
}
void main()
{
    int arr[]= {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,111,222,333,444,555,666,777};
    int size = sizeof(arr)/sizeof(int);
    int element;
    printf("Enter the element you want to search in this array\n");
    scanf("%d",&element);
    binarySearch(arr,size,element);
}
