#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
void display(struct node *temp)
{
    int i = 0;
    while (temp != NULL)
    {
        printf("Element at index %d: %d\n", i, temp->data);
        temp = temp->next;
        i++;
    }
}
struct node *deletioninbetween(struct node *head,int index)
{
    struct node * p = head;
    struct node * q = head->next;
    for(int i = 0;i<index-1;i++)
    {
        p=p->next;
        q=q->next;
    }
    p->next = q->next;
    free(q);
    return head;
}
void main()
{
    struct node *head = (struct node *)malloc(sizeof(struct node));
    struct node *second = (struct node *)malloc(sizeof(struct node));
    struct node *third = (struct node *)malloc(sizeof(struct node));
    struct node *tail = (struct node *)malloc(sizeof(struct node));

    head->data = 7;
    head->next = second;
    second->data = 11;
    second->next = third;
    third->data = 41;
    third->next = tail;
    tail->data = 66;
    tail->next = NULL;

    display(head);

    head = deletioninbetween(head,2);

    display(head);
}