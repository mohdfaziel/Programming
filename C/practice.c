#include<stdio.h>
void main()
{
    int n;
    int arr[n];
    scanf("%d",&n);
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&arr[i]);
    }
    int min = arr[0], max = arr[0], sum = 0;
    for (int i = 0; i < n; i++)
    {
        if (min > arr[i])
        {
            min = arr[i];
        }
        if (max < arr[i])
        {
            max = arr[i];
        }
    }
    sum = max + min;
    printf("%d",sum);
}