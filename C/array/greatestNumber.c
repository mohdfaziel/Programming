//wap to find greatest number in an array
#include<stdio.h>
#include<conio.h>
void main() {
    int arr[5]= {4,6,8,3,5};
    int greatest = 0;
    for(int i = 0;i<5;i++){
        if(arr[i]>greatest){
            greatest = arr[i];
        }
    }
    printf("%d",greatest);
}