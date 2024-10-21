#include<stdio.h>
void main()
{
    int a[3][3],b[3][3],i,j,c[3][3],k;
    printf("\nenter the first matrix");
    for(i=0;i<3;i++)
    for(j=0;j<3;j++)
    {
        printf("\nenter the elements of first matrix");
        scanf("%d",&a[i][j]);
    }
    printf("\nenter the second matrix");
    for(i=0;i<3;i++)
    for(j=0;j<3;j++)
    {
        printf("\nEnter the elements of second matrix");
        scanf("%d",&b[i][j]);
    }
    
printf("First matrix");
for(i=0;i<3;i++)
    {
        printf("\n");
        for(j=0;j<3;j++)
        printf("%d\t",a[i][j]);
    }
    printf("second matrix");
    for(i=0;i<3;i++)
    {
        printf("\n");