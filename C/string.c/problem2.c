// waf named slice which takes string and return a sliced string from the index n to m
#include<stdio.h>
#include<string.h>
void main()
{
    int n,m;
    char name[100];
    printf("Enter any string\n");
    scanf("%s",name);
    printf("Enter the index n\t");
    scanf("%d",n);
    printf("Enter the index m\t");
    scanf("%d",m);
    for(int i = n; i<=m; i++)
    {
        printf("%c",name[i]);
    }
}