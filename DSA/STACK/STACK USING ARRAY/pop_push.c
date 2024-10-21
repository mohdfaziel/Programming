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
void push(struct stack *ptr,int value)
{
    if(isfull(ptr))
    {
        printf("Stack overflow\n");
    }
    else
    {
        ptr->top++;
        ptr->arr[ptr->top] = value;
        printf("Element %d pushed sucessfully\n",value);
    }
}
int pop(struct stack * ptr)
{
    int temp;
    if(isempty(ptr))
    {
        printf("Stack underflow\n");
        return -1;
    }
    else
    {
        temp = ptr->arr[ptr->top];
        ptr->top--;
        printf("Element %d popped sucessfully\n",temp);
    }
    return temp;
}
void main()
{
    s = (struct stack*)malloc(sizeof(struct stack));
    s->size=80;
    s->top= -1;
    s->arr = (int*)malloc(sizeof(int));
    push(s,10); // inserted the element 10 in the stack...
    push(s,20); // inserted the element 20 in the stack...
    push(s,30); // inserted the element 30 in the stack...
    pop(s); // removed the topmost element i.e 30 from the stack...

}