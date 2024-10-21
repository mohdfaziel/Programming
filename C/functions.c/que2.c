#include<stdio.h>
void indian();
void french();
void main()
{
    char nationality;
    printf("Enter f for french and i for indian\n");
    scanf("%c",&nationality);
    if(nationality=='i')
    {
        indian();
    }else{
        french();
    }
}
void indian()
{
    printf("namaste");
}
void french()
{
    printf("Bonjour");
}