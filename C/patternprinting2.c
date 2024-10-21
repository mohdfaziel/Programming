#include<stdio.h>
#include<conio.h>
void main(){
    int rows,columns;
    scanf("%d%d",&rows,&columns);
    for(int i = 1; i<=rows;i++){
        for(int j=1;j<=columns;j++){
            if(i==1 || j==1||i==rows||j==columns){
                printf("*");
            } else{
                printf(" ");
            }
        }
        printf("\n");
    }
    }