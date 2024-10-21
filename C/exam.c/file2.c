//بسم الله 
#include<stdio.h>
void main()
{
    FILE *file1,*file2;
    file1 = fopen("file1.txt","r");
    file2 = fopen("file2.txt","w");
    char ch;
    while(fscanf(file1,"%c",&ch)!= EOF)
    {
        fprintf(file2,"%c",ch);
    }
    fclose(file1);
    fclose(file2);
}