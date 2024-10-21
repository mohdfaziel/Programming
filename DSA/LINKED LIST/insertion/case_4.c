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
struct node * insertionAfterNode(struct node *head,struct node *previousnode,int data)
{
    struct node * ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data;
    ptr->next = previousnode->next;
    previousnode->next = ptr;
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
    head = insertionAfterNode(head,third,23); // inserting a node after third node
    display(head);

}
