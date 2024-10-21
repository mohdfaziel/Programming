// wap to use string functions
#include<stdio.h>
#include<string.h>
void main()
{
    char name[] = "Faziel";
    char caste[] = "sheikh";

    //string copy
    strcpy(name,caste); //now name = sheikh

    //string concatenates
    strcat("abcd","efgh"); // abcdefgh

    //string length
    int n = strlen(name); // 6
    printf(" %d",n);

    //string compare 
    int comp = strcmp("abcd","abed"); // c-d => 99-101 => -2 ans
}