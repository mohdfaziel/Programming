//wap to check weathere a character is present in a string or not
#include<stdio.h>
#include<string.h>
void charsearch(char str[],char ch)
{
    for(int i = 0; str[i]!= '\0'; i++)
    {
        if(str[i]==ch)
        {
            printf("char is present at the index %d",i);
            return;
        }
    }
    printf("char isnt present");
}
void main()
{
    char name[] = "faziel";
    charsearch(name,'t');
}