#include<stdio.h>
#include<conio.h>
void main (){
    int week;
    scanf("%d",&week);
    switch(week){
        case 1:printf("Monday");
        break;
        case 2: printf("tuesday");
        break;
        case 3: printf("wednesday");
        break;
        case 4: printf("thursdday");
        break;
        case 5: printf("friday");
        break;
        case 6: printf("satursday");
        break;
        case 7: printf("sunday");
        break;
        default: printf("invalid day number");
        break;

    }
}