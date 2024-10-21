#include<stdio.h>
#include<conio.h>
void main()
{
    int t1=0,t2=1,next_term,num,fbnc_series;
    printf("Enter the number of terms\n");
    scanf("%d",&num);
    printf("%d,%d,",t1,t2); // printing 1st two terms
    for(int i = 3; i<=num ; i++) // starting a loops to print terms from 3rd to num
    {
        next_term = t1+t2; // each next term is sum of previous two terms
        t1=t2;  
        t2=next_term;
        printf("%d,",next_term);
    }
}