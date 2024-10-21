// بسم الله
#include <stdio.h>
int binarysearch(int arr[], int size, int element)
{
   int low=0,high=size-1,mid;
   while(low<=high)
   {
    mid = (low+high)/2;
    if(arr[mid]==element)
    {
        return mid;
    }
    else if(arr[mid]<element)
    {
        low=mid+1; //because arr[mid] is already checked
    }
    else if(arr[mid]>element)
    {
        high=mid-1; //because arr[mid] is already checked
    }
   }
   return -1;
}
void main()
{
    int arr[100];
    int size, element, i;
    printf("Enter the size of the array\n");
    scanf("%d", &size);
    printf("Enter the elements of the array\n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Enter the elements to be searched\n");
    scanf("%d",&element);
    i = binarysearch(arr, size, element);
    if (i == -1)
    {
        printf("Element not found\n");
    }
    else
    {
        printf("Element %d is present at index %d", element, i);
    }
}