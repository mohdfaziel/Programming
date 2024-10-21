// stack creation with linked list along with the operations like pop,push,isempty,isfull and traversal...
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * next;
}*top=NULL;
void traversal()
{
    struct node * temp;
    temp=top;
    int i = 1;
    while(temp!=NULL)
    {
        printf("Element on position %d is %d:\n",i,temp->data);
        temp = temp->next;
        i++;
    }
}
int isempty()
{
    if(top==NULL)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int isfull()
{
    struct node * temp = (struct node*)malloc(sizeof(struct node));
    if(temp==NULL)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void push(int element)
{
    if(isfull())
    {
        printf("Stack overflow\n");
    }
    else
    {
        struct node * temp = (struct node*)malloc(sizeof(struct node));
        temp->data = element;
        temp->next = top;
        top = temp;
        printf("Element %d pushed sucessfully\n",element);
    }
}
int pop()
{
    if(isempty())
    {
        printf("Stack underflow\n");
    }
    else
    {
        struct node * temp = malloc(sizeof(struct node));
        temp->data = top->data;
        top = top->next;
        return temp->data;
        free(temp);
    }
}
void main()
{
    push(1);
    push(2);
    push(3);
    push(4);
   printf("Element %d popped sucessfully\n",pop());
   traversal();
}
