//بسم الله 
//wap to get information of a student from the user and enter this data into a file
#include<stdio.h>
void main()
{
    FILE *fptr;
    fptr = fopen("student.txt","w");

    char name[100];
    int age;
    float cgpa;

    printf("Enter name of the student\n");
    scanf("%s",name);
    printf("Enter age of the student\n");
    scanf("%d",&age);
    printf("Enter cgpa of the student\n");
    scanf("%f",&cgpa);

    fprintf(fptr,"NAME : %s\n",name);
    fprintf(fptr,"AGE : %d\n",age);
    fprintf(fptr,"CGPA : %f\n",cgpa);

    fclose(fptr);
}