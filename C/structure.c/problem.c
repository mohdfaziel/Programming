// wap to enter address(house number,block,city,state) of 5 people;
#include<stdio.h>
struct address
{
    int houseno;
    char block;
    char city[100];
    char state[100];
}people[5];
void main()
{
    for(int i = 0;i<5;i++)
    {
        printf("Enter houseno of person %d\t",i+1);
        scanf("%d",&people[i].houseno);
        printf("Enter block of person %d\t",i+1);
        scanf("%c",&people[i].block);
        printf("Enter city of person %d\t",i+1);
        scanf("%s",people[i].city);
        printf("Enter state of person %d\t",i+1);
        scanf("%s",people[i].state);
    }
}
