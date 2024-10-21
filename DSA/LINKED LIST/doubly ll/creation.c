#include <stdio.h>
#include<stdlib.h>
struct node
{
    struct node * prev;
    int data;
    struct node *next;
};
void linklisttraversal(struct node *ptr) // TRAVERSAL USING NEXT
{
    while(ptr!=NULL)
    {
        printf("Value: %d\n",ptr->data);
        ptr = ptr->next;
    }
}
void linklisttraversal_(struct node *ptr) // TRAVERSAL USING PREV IN REVERSE ORDER
{
    while(ptr!=NULL)
    {
        printf("Value: %d\n",ptr->data);
        ptr = ptr->prev;
    }
}

void main()
{
    struct node *head;
    struct node *second;
    struct node *third;
    struct node *tail;
    

    head = (struct node*)malloc(sizeof(struct node));
    second = (struct node*)malloc(sizeof(struct node));
    third = (struct node*)malloc(sizeof(struct node));
    tail = (struct node*)malloc(sizeof(struct node));

    head->prev = NULL;
    head->data = 7;
    head->next = second;

    second->prev = head;
    second->data = 11;
    second->next = third;

    third->prev = second;
    third->data = 15;
    third->next = tail;

    tail->prev = third;
    tail->data = 18;
    tail->next = NULL;
    printf("Traversal using next\n");
    linklisttraversal(head);
    printf("Traversal using prev\n");
    linklisttraversal_(tail);
}