#include<stdio.h>
void display(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d,", arr[i]);
    }
    printf("\n");
}
void insertion(int arr[], int size, int capacity, int index, int element)
{
    if (size >= capacity)
    {
        printf("Insufficient memory for insertion\n");
    }
    else
    {
        for (int i = size - 1; i >= index; i--)
        {
            arr[i + 1] = arr[i];
        }
    }
    arr[index] = element;
    if (arr[index] == element)
    {
        printf("Insertion sucessful\n");
    }
}
void main()
{
    int arr[100];
    int index, size, element;
    printf("Enter the size of the array: \n");
    scanf("%d", &size);
    printf("Enter the index to perform insertion: \n");
    scanf("%d", &index);
    printf("Enter the element to be inserted: \n");
    scanf("%d", &element);
    printf("Enter the elements of the array: \n");
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Array before insertion\n");
    display(arr, size);
    insertion(arr, size, 100, index, element);
    size += 1;
    printf("Array after insertion\n");
    display(arr, size);
}