#include<stdio.h>
void insertionsort(int arr[],int size){
    for(int i = 1; i< size; i++)
    {
        int current = arr[i];
        int j = i-1;
        while(arr[j]>current && j>0)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current;
    }
    for(int i = 0; i< size; i++)
    {
        printf("%d\t",arr[i]);
    }
}
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
    insertionsort(arr,size);
}