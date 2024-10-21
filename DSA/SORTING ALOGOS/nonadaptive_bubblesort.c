#include<stdio.h>
void swap(int *a,int *b)
{
    int temp = *a;
    *a=*b;
    *b=temp;
}
void display(int *arr,int size)
{
    for (int i = 0; i < size; i++)
    {
        printf("%d,",arr[i]);
    }
    printf("\n");
    
}
void non_adaptive_bubblesort(int *arr,int size)
{
    for(int i=0;i<size-1;i++)
    {
        for(int j=0;j<size-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                swap(&arr[j],&arr[j+1]);
            }
        }
    }
}

void main()
{
    int arr[100],size;
    printf("Enter the size of the array: \n");
    scanf("%d",&size);
    printf("Enter the elements of the array: \n");
    for(int i = 0;i<size;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("before bubblesort: \n");
    display(arr,size);
    printf("After bubblesort\n");
    non_adaptive_bubblesort(arr,size);
    display(arr,size);


}