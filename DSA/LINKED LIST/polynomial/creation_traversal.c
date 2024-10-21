// Creation, insertion and traversal of a polynomial using linked lists
#include<stdio.h>
#include<stdlib.h>
struct node
{
    float coeff;
    int expo;
    struct node* next;
};
struct node * insert(struct node *head, float coeff, int expo)
{
    struct node * temp;
    struct node * newp = malloc(sizeof(struct node));
    newp->coeff= coeff;
    newp->expo = expo;

    if(head==NULL || expo > head->expo)
    {
        newp->next = head;
        head = newp;
    }
    else
    {
        temp = head;
        while(temp->next !=NULL && temp->next->expo >= expo)
        {
            temp = temp->next;
        }
        newp->next = temp->next;
        temp->next = newp;
    }
    return head;
}
struct node * create(struct node * head)
{
    int n,expo;
    float coeff;
    printf("Enter the no of terms in a polynomail\n");
    scanf("%d",&n);
    for(int i = 0; i<n;i++)
    {
        printf("Enter the coefficient of the term %d: \n",i+1);
        scanf("%f",&coeff);
        printf("Enter the exponent of the term %d: \n",i+1);
        scanf("%d",&expo);
        head = insert(head,coeff,expo);
    }
    return head;
}
void display(struct node * head)
{
    if(head==NULL)
    {
        printf("NO polynomial found\n");
    }
    else 
    {
        struct node * temp = head;
        while(temp!=NULL)
        {
            printf("(%1.fx^%d)",temp->coeff,temp->expo);
            temp=temp->next;
            if(temp!=NULL)
            {
                printf(" + ");
            }
            else
            {
                printf("\n");
            }
        }
    }
}
void main()
{
    struct node * head = NULL;
    head = create(head);
    display(head);
}