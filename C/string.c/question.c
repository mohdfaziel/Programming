// wap to calculate the number of vowels and consonants in a string
#include<stdio.h>
#include<string.h>
void main()
{
    char fullname[] = "faziel sheikh";
    int vowels = 0;
    int consonants = 0;
    for(int i = 0; fullname[i]!= '\0'; i++)
    {
        if(fullname[i] == 'a' || fullname[i]=='e'|| fullname[i]=='i' || fullname[i] =='o' || fullname[i]=='u')
        {
                vowels++;
        }
        else if(fullname[i]!= ' ')
        {
            consonants++;
        }
    }
    printf("The number of vowels in this string are %d\n",vowels);
     printf("The number of consonants in this string are %d",consonants);
}