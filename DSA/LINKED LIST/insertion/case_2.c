// insertion in between
// Insertion at the beginning
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node * insertioninbetween(struct node*head,int data, int index)
{
    struct node *ptr = (struct node*)malloc(sizeof(struct node));
    struct node *p =head;
    int i = 0;
    while(i!=index-1)
    {
        p = p->next;
        i++;
    }
    ptr->data = data;
    ptr->next = p->next;
    p->next = ptr;
    return head; // because head is still head
}
void display(struct node *ptr)
{
    while(ptr!=NULL)
    {
        printf("Value = %d\n",ptr->data);
        ptr = ptr->next;
    }
}
void main()
{
    struct node *head = (struct node*)malloc(sizeof(struct node));
    struct node *second=(struct node*)malloc(sizeof(struct node));
    struct node *third=(struct node*)malloc(sizeof(struct node));
    struct node *tail=(struct node*)malloc(sizeof(struct node));

    head->data =7;
    head->next = second;
    second->data =11;
    second->next = third;
    third->data =41;
    third->next = tail;
    tail->data =66;
    tail->next = NULL;

    display(head);

    head = insertioninbetween(head,56,2); // updation of the head

    display(head);




    
}