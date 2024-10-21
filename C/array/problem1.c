// print elements of a 2d array in a matrix form
#include<conio.h>
#include<stdio.h>
void main (){
int a[3][4];
printf("Enter elements of the array\n");
for(int i = 0;i<3;i++){
    for(int j=0;j<4;j++){
        scanf("%d",&a[i][j]);
    }
}
    printf("Matrix formed with the help of these elements is\n");

    for(int i = 0;i<3;i++){
        printf("\n"); // important step to create line so that the output will be in the form of matrix
    for(int j=0;j<4;j++){
        printf("%d  ",a[i][j]);
}
}
}
