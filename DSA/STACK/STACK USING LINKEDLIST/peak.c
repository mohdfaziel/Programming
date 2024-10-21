// implementation of peak , stack top, stack bottom...
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * next;
}*top=NULL;
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
int peak(int position)
{
    struct node * temp;
    temp = top;
    for(int i = 0; (i < position-1 && temp != NULL); i++)
    {
        temp = temp->next;
    }
    if(temp!=NULL)
    {
        return temp->data;
    }
    else
    {
        return -1; // note for this -1 should not be present in the stack as an element...
    }
}
int stacktop()
{
    return top->data;
}
int stackbottom()
{
    struct node * temp=top;
    while(temp->next!=NULL)
    {
        temp = temp->next;
    }
    return temp->data;
}
void main()
{
    push(1);
    push(2);
    push(3);
    push(4);
    for(int i = 1; i<=4 ; i++)
    {
    printf("Element present at the index %d is %d\n",i,peak(i));
    }
    printf("Top element of this stack is %d\n",stacktop());
    printf("bottom element of this stack is %d\n",stackbottom());
}
