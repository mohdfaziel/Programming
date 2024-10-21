//insertion at the beginning
#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};
void display(struct node *head)
{
    struct node* ptr= head;
   do
   {
        printf("Element is %d: \n",ptr->data);
        ptr = ptr->next;
   }while(ptr != head);
}
struct node * insertionatbeginning(struct node * head,int data)
{
    struct node * ptr = (struct node*)malloc(sizeof(struct node));
    ptr->data= data;
    struct node * p = head;
    do
    {
        p = p->next;
    }while(p->next!=head);
    p->next = ptr;
    ptr->next = head;
    head = ptr;
    return head;
}
void main()
{
    struct node *head = (struct node*)malloc(sizeof(struct node));
    struct node *second=(struct node*)malloc(sizeof(struct node));
    struct node *third=(struct node*)malloc(sizeof(struct node));
    struct node *tail=(struct node*)malloc(sizeof(struct node));

    head->data =4;
    head->next = second;
    second->data =3;
    second->next = third;
    third->data =6;
    third->next = tail;
    tail->data =1;
    tail->next = head;
printf("Before insertion\n");
    display(head);
printf("After insertion\n");
head = insertionatbeginning(head,54);
    display(head);
}