#include<stdio.h>
#include<conio.h>
void main(){
    int rows;
    scanf("%d",&rows);
    for(int i = 0; i<=rows; i++){
        for(int j= 1; j<=(rows-i);j++){
            goto answer;
            answer: printf("%d",j);
        }
        printf("\n");
    }
}