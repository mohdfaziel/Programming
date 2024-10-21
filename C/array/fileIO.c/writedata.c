#include<stdio.h>
void main()
{
    FILE *ptr;
    ptr = fopen("test.txt","w");
    fprintf(ptr,"%c",'M');
    fprintf(ptr,"%c",'A');
    fprintf(ptr,"%c",'N');
    fprintf(ptr,"%c",'G');
    fprintf(ptr,"%c",'O');

    // this data can also be input through
    fputc(' ',ptr);
    fputc('m',ptr);
    fputc('a',ptr);
    fputc('n',ptr);
    fputc('g',ptr);
    fputc('o',ptr);

    fclose(ptr);

}