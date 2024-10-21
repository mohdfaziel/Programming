// wap to reverse an array using functions
#include<stdio.h>
void main()
{
    int arr[5] ={5,7,8,3,5};
    reverse(arr,5);
}
void reverse(int arr[],int size)
{
    for(int i = 0; i<(size/2);i++)
    {
        int temp = arr[i];
        arr[i] = arr[4-i]; // cause index of 5 sized array is till 4
        arr[4-i] = temp;
    }   
    for(int i = 0; i<5;i++)
    {
        printf("%d",arr[i]);
    }
}