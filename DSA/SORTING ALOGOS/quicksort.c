// Harrys program for reference

// #include <stdio.h>

// void printArray(int *A, int n)
// {
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ", A[i]);
//     }
//     printf("\n");
// }

// int partition(int A[], int low, int high)
// {
//     int pivot = A[low];
//     int i = low + 1;
//     int j = high;
//     int temp;

//     do
//     {
//         while (A[i] <= pivot)
//         {
//             i++;
//         }

//         while (A[j] > pivot)
//         {
//             j--;
//         }

//         if (i < j)
//         {
//             temp = A[i];
//             A[i] = A[j];
//             A[j] = temp;
//         }
//     } while (i < j);

//     // Swap A[low] and A[j]
//     temp = A[low];
//     A[low] = A[j];
//     A[j] = temp;
//     return j;
// }

// void quickSort(int A[], int low, int high)
// {
//     int partitionIndex; // Index of pivot after partition

//     if (low < high)
//     {
//         partitionIndex = partition(A, low, high); 
//         quickSort(A, low, partitionIndex - 1);  // sort left subarray 
//         quickSort(A, partitionIndex + 1, high); // sort right subarray
//     }
// }

// int main()
// {
//     //int A[] = {3, 5, 2, 13, 12, 3, 2, 13, 45};
//     int A[] = {9, 4, 4, 8, 7, 5, 6};
//     // 3, 5, 2, 13, 12, 3, 2, 13, 45
//     // 3, 2, 2, 13i, 12, 3j, 5, 13, 45
//     // 3, 2, 2, 3j, 12i, 13, 5, 13, 45 --> first call to partition returns 3
//     int n = 9;
//     n =7;
//     printArray(A, n);
//     quickSort(A, 0, n - 1);
//     printArray(A, n);
//     return 0;
// }

#include<stdio.h>
#include<stdlib.h>
void traversal(int * arr,int size){
    for(int i = 0; i< size;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\n");
}
int partition(int *arr,int low,int high)
{
    int pivort = arr[low];
    int i = low+1;
    int j = high;
    int temp;
    while (i<j)
    {
        while(arr[i]<=pivort) // finding element greater than pivort
        {
            i++;
        }
        while(arr[j]>pivort) // finding element smaller than pivort
        {
            j--;
        }
        if(i<j)
        {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    } 
    
    // we came out from the above do while loop it means now j<=i
    // so we will swap pivort with A[j]
    temp = arr[low];  // arr[low] is pivort
    arr[low] = arr[j];
    arr[j] = temp;
    return j;  // returning the positon of pivort element after it has been placed to its right position

}
void quicksort(int * arr,int low,int high)
{
    int partitionIndex; // Index of the pivort element after partition
    if(low<high) // Atleast 2 elements should be present in the array to partition
    {
        partitionIndex = partition(arr,low,high);
        quicksort(arr,low,partitionIndex-1); // sort left subarray
        quicksort(arr,partitionIndex+1,high); //sort right subarray
    }

}
void main()
{
    int n;
    printf("Enter the size of the array\n");
    scanf("%d",&n);
    int * arr = (int*)malloc(n * sizeof(int));
    printf("Enter the elements of the array\n");
    for(int i = 0;i<n;i++){
        scanf("%d",&arr[i]);
    }

    printf("Before quicksort\n");
    traversal(arr,n);

    quicksort(arr,0,n-1);
    printf("After quicksort\n");
    traversal(arr,n);
}
