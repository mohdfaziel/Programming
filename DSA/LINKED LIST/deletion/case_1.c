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
struct node *deletionAtbeginning(struct node *head)
{
    // struct node *temp = (struct node *)malloc(sizeof(struct node)); no need to allocate memory because we aren't storing any data in this node
    struct node * temp = head;
    head = head->next;
    free(temp);
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

    head = deletionAtbeginning(head);

    display(head);
}