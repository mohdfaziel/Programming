// بسم الله
#include <stdio.h>
void display(int *arr, int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d,", arr[i]);
    }
    printf("\n");
}
void insertion_sort(int *arr, int size)
{
    int key, j;
    for (int i = 1; i < size; i++)
    {
        key=arr[i];
        j = i - 1;
        while (j>=0 &&arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
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
    printf("before insertionsort: \n");
    display(arr, size);
    printf("After insertionsort\n");
    insertion_sort(arr, size);
    display(arr, size);
}
