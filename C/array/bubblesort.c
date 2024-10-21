#include<stdio.h>
void bubblesort(int arr[],int size)
{
    int counter=1;
    while(counter<size) // here size of array is 6 so no of iteration is 5
    {
        for(int i = 0; i<(size-counter);i++)
        {
            if(arr[i]>arr[i+1])
            {
                int temp = arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }
        }
        counter++;
    }
    for(int i = 0; i< size; i++)
    {
        printf("%d\t",arr[i]);
    }
}
void main()
{
        int size;
        printf("Enter the size of the array\n");
        scanf("%d",&size);
        int arr[size];
        printf("Enter the elements of the array\n");
        for(int i = 0; i < size; i++)
        {
            scanf("%d",&arr[i]);
        }
        bubblesort(arr,size);
}
