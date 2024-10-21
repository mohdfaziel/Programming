//wap to read two 1d arrays of size 5 and store the sum of these arrays into 3rd array
#include<stdio.h>
#include<conio.h>
void main(){
    int arr1[5],arr2[5],arr3[5];
    printf("Enter the elements of first array\n");
    for(int i = 0;i<5;i++){
        scanf("%d",&arr1[i]);
    }
    printf("Enter the elements of 2nd array\n");
    for(int i  = 0;i<5;i++){
        scanf("%d",&arr2[i]);
    }
    for(int i = 0;i<5;i++){
        arr3[i]= arr1[i] + arr2[i];
    }
    printf("now the elements of third array will be\n");
    for(int i=0;i<5;i++){
        printf("%d,",arr3[i]);
    }
}