#include <stdio.h>
#define max 10
void swap(int *m, int *n)
{
    int temp = *m;
    *m = *n;
    *n = temp;
}
void bubblesort(int *arr)
{
    for (int i = 0; i < max - 1; i++)
    {
        for (int j = 0; j < max - 1 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(&arr[j], &arr[j + 1]);
            }
        }
    }
}
void display(int arr[])
{
    for (int i = 0; i < max; i++)
    {
        printf("%d element of array is %d\n", i + 1, arr[i]);
    }
}
int main()
{
    int arr[max];
    printf("Enter the elements of the %d sized array\n", max);
    for (int i = 0; i < max; i++)
    {
        scanf("%d", &arr[i]);
    }
    bubblesort(arr);
    display(arr);
    return 0;
}