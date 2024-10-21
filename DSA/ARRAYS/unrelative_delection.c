#include <stdio.h>
void display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d,", arr[i]);
    }
    printf("\n");
}
void deletion(int arr[], int size, int index)
{

    arr[index]=arr[size-1];
    
}
void main()
{
    int arr[100];
    int index, size;
    printf("Enter the size of the array: \n");
    scanf("%d", &size);
    printf("Enter the index to perform deletion: \n");
    scanf("%d", &index);
    printf("Enter the elements of the array: \n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("Array before deletion\n");
    display(arr, size);
    deletion(arr, size,index);
    size -= 1;
    printf("Array after deletion\n");
    display(arr, size);
}