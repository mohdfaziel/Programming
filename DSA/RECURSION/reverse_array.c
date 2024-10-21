// write a program to print reverse of the array using recursion
#include<stdio.h>
#define max 100
void reverse(int arr[],int size)
{
    if(size==-1)
    {
        return;
    }
    else
    {
        printf("%d\n",arr[size]);
        reverse(arr,size-1);
    }
}
void main()
{
    int arr[max];
    int size;
    printf("Enter the size of the array(i.e less than 100)\n");
    scanf("%d",&size);
    printf("Enter the elements of the array\n");
    for(int i = 0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Now the reverse of the array is:\n");
    reverse(arr,size-1);
}