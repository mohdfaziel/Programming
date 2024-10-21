#include<stdio.h>
#include<stdlib.h>
struct stack
{
    int size;
    int top;
    int * arr;
}*s;
int isempty(struct stack * ptr)
{
    if(ptr->top==-1)
    {
        return 1;
    }
    else{
        return 0;
    }
}
int isfull(struct stack * ptr)
{
    if(ptr->top==ptr->size-1)
    {
        return 1;
    }
    else{
        return 0;
    }
}
void main()
{
    s = (struct stack*)malloc(sizeof(struct stack));
    s->size=80;
    s->top= -1;
    s->arr = (int*)malloc(sizeof(int));
    if(isempty(s))
    {
        printf("Stack is empty\n");
    }
    else if(isfull(s))
    {
        printf("Stack is full\n");
    }
}