//بسم الله 
#include<stdio.h>
void display(int *arr, int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d,", arr[i]);
    }
    printf("\n");
}
void selection_sort(int arr[],int size)
{
    for(int i = 0;i<size-1;i++)
    {
        for(int j = i+1;j<size;j++)
        {
            if(arr[i]>arr[j])
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
void main()
{
    int arr[100], size;
    printf("Enter the size of the array: \n");
    scanf("%d", &size);
    printf("Enter the elements of the array: \n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("before selectonsort: \n");
    display(arr, size);
    printf("After selectionsort\n");
    selection_sort(arr, size);
    display(arr, size);
}