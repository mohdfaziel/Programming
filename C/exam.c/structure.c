//بسم الله 
#include<stdio.h>
struct organization 
{
    int code;
    char name[100];
    char designation[100];
    int salary;
    char department[100];
    char cityOfPosting[100];
};
void main()
{
    struct organization employes[100];
    for(int i = 0;i<100;i++)
    {
        printf("Enter the details of employ %d i.e CODE-NAME-DESIGNATION-SALARY-DEPARTMENT-CITY OF POSTING",i+1);
        scanf("%d%s%s%d%s%s",employes[i].code,employes[i].name,employes[i].designation,employes[i].salary,employes[i].department,employes[i].cityOfPosting);
    }
    for(int i = 0;i<100;i++)
    {
        if(employes[i].salary>=20000)
        {
            printf("%s\n",employes[i].name);
        }
    }
    
}