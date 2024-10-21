// Insertion at the beginning
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
struct node * insertionAtfirst(struct node*head,int data) //this returns new head of type struct node
{
    struct node *ptr= (struct node*)malloc(sizeof(struct node)); //new node which is to be inserted
    ptr->data = data;
    ptr->next = head;
    return ptr; // returning ptr because now ptr is new head
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

    head = insertionAtfirst(head,56); // updation of the head

    display(head);




    
}