#include<stdio.h>
#include<conio.h>
void main(){
    float math,physics,chemistry,totalMarks;
    float percentage;
    printf("Enter marks obtained in math\n");
    scanf("%f",&math);
    printf("Enter marks obtained in physics\n");
    scanf("%f",&physics);
    printf("Enter marks obtained in chemistry\n");
    scanf("%f",&chemistry);
    totalMarks = 300;
    percentage = (math+chemistry+physics)/totalMarks * 100;
    printf("thus the pcm percentage is %f", percentage);
    getch();
}