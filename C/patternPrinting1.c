#include<stdio.h>
#include<conio.h>
void main(){
    int rows;
    printf("Enter the number of lines till which you want to print the pattern\n");
    scanf("%d",&rows);
    for(int i = 0; i<rows;i++){
        for(int j=1;j<=(rows-i);j++){
            printf("*");
        }
        printf("\n");
    }
}