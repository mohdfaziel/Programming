#include<stdio.h>
#include<conio.h>
void main (){
    int arr[4][5]={{1,2,3,4,5},{6,7,8,9,11},{22,33,44,55,66},{77,88,99,12,34}};
    for(int i = 0;i<4;i++){
        for(int j=0;j<5;j++){
            printf("%d,",arr[i][j]);
        }
    }
    }