#include<stdio.h>
void main () 
{
    int size;
    printf("Enter the size of the array\n");
    scanf("%d",&size);
    int arr[size];
    printf("Enter the elements of the array\n");
    for(int i=0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    selectionSort(arr,size);
}
void selectionSort(int arr[],int size)
{
    for(int i=0; i<(size-1);i++ )
    {
        for(int j = i+1; j<size; j++)
        {
            if(arr[j]<arr[i])
            {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    for(int i = 0; i<size; i++)
    {
        printf("%d\t",arr[i]);
    }
}