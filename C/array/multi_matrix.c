#include<conio.h>
#include<stdio.h>
void main ()
{
    int mat1[3][2], mat2[2][3], mat3[3][3],sum; // k= 2
    printf("Enter the elements of the first matrix\n");
    for(int i = 0; i<3; i++)
    {
        for(int j= 0; j<2; j++)
        {
            printf("Enter the %d %d element of 1st matrix\n",i,j);
            scanf("%d",&mat1[i][j]);
        }
    }
    printf("Enter the elements of the second matrix\n");
    for(int i = 0; i<2; i++)
    {
        for(int j= 0; j<3; j++)
        {
            printf("Enter the %d %d element of 2nd matrix\n",i,j);
            scanf("%d",&mat2[i][j]);
        }
    }
    printf("Now the multiplication of these  matrices is\n");
    for(int i = 0; i<3; i++)
    {
        printf("\n");
        for(int j= 0; j<3; j++)
        {
            sum=0;
            for(int k = 0; k<2;k++)
            {
                sum+= mat1[j][k]*mat2[k][j];
            }
            mat3[i][j] = sum;
            printf("%d\t",mat3[i][j]);
            
            
        }
    }
    
}
