#include<stdio.h>
struct info
{
    char address[100];
};
void main(){
    struct info employes[10];
    for(int i = 1; i<=10;i++)
    {
        printf("Enter the address of the employ %d\n",i);
        scanf("%s",employes[i].address); // in string we don't have to use address operator to take input
    }
    for(int i = 0;i<10;i++)
    {
        printf("%s\n",employes[i].address);
    }
    
}

    