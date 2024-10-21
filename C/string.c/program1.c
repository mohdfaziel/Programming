//wap to create string first name and last name and store values
// in it 
#include<stdio.h>
void main()
{
    char firstname[]= {'f','a','z','i','e','l','\0'}; // this \0 defines it is a string and not a normal character array
    char lastname[] ={'s','h','e','i','k','h','\0'};

    // OR

    char firstname2[]={"faziel"};
    char lastname2[]= {"sheikh"};

    //OR
    
    char firstname3;
    scanf("%s",firstname3);

    //OR

    char firstname4;
    fgets(firstname4,100,stdin);
}
