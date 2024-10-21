// بسم الله
#include <stdio.h>
int linearsearch(int arr[], int size, int element)
{
    int index = -1;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] == element)
        {
            index = i;
            break;
        }
    }
    return index;
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
    i = linearsearch(arr, size, element);
    if (i == -1)
    {
        printf("Element not found\n");
    }
    else
    {
        printf("Element %d is present at index %d", element, i);
    }
}