#include<stdio.h>
#include<string.h>
struct data
{
    int rollno;
    char name[10];
}s1,s2;
void info(struct data x,struct data y);
void main()
{
    strcpy(s1.name,"Faziel");
    strcpy(s2.name,"sheikh");
    s1.rollno = 12;
    s2.rollno = 41;
    info(s1,s2);
}
void info(struct data x,struct data y)
{
    printf("Name and rollno of first student is : %s and %d\n",x.name,x.rollno);
    printf("Name and rollno of 2nd student is : %s and %d\n",y.name,y.rollno);
}