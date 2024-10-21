// wap to find the odd and even numbers of an array and also their count.
//بسم الله 
#include<stdio.h>
void main()
{
    int arr[10] = {1,2,3,4,5,6,7,8,9,10};
    int countODD = 0;
    int countEVEN = 0;
    for(int i = 0;i<10;i++)
    {
        if(arr[i]%2==0)
        {
            printf("Even number : %d\n",arr[i]);
            countEVEN++;
        }
        else
        {
            printf("Odd number : %d\n",arr[i]);
            countODD++;
        }
    }
    printf("Number of even numbers in the array is : %d\n",countEVEN);
    printf("Number of odd numbers in the array is : %d\n",countODD);

}