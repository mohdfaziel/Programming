// CREATION AND TRAVERSAL
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
        printf("Element is %d: \n",ptr->data); //head start
        ptr = ptr->next;
   }while(ptr != head);
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

    display(head);
}