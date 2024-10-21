//Insertion at the end of the list
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node * next;
}*head,*second,*third,*tail;
void display(struct node *ptr)
{
    while(ptr!=NULL)
    {
        printf("Value = %d\n",ptr->data);
        ptr = ptr->next;
    }
}
struct node * insertionAtend(struct node *head,int data)
{
    struct node * ptr=(struct node*)malloc(sizeof(struct node));
    struct node * temp = head;
    while(temp->next!=NULL)
    {
        temp = temp->next;
    }
    temp->next = ptr;
    ptr->data = data;
    ptr->next = NULL;
    return head;
}

void main()
{
    head = (struct node*)malloc(sizeof(struct node));
    second = (struct node*)malloc(sizeof(struct node));
    third = (struct node*)malloc(sizeof(struct node));
    tail = (struct node*)malloc(sizeof(struct node));

    head->data=11;
    head->next=second;
    second->data=45;
    second->next=third;
    third->data=56;
    third->next=tail;
    tail->data=66;
    tail->next=NULL;
    display(head);
    head = insertionAtend(head,23);
    display(head);

}
