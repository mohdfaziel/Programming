#include<stdio.h>
#include<stdlib.h>
struct node {
    float coeff;
    int expo;
    struct node* next;
};
struct node* insertion(struct node* head,float coeff,int expo)
{
    struct node * p = head;
    struct node * new = (struct node*)malloc(sizeof(struct node));
    new->coeff = coeff;
    new->expo = expo;
    new->next = NULL;
    if(p==NULL || p->expo < expo)
    {
        new->next = p;
        head = new;
        return head;
    }else
    {
        struct node* q = head->next;
        while(q!=NULL && q->expo > expo)
        {
            p=p->next;
            q = q->next;
        }
        p->next = new;
        new ->next = q;
        return head;
    }
}
    void traverse(struct node* head)
    {
        struct node * temp = head;
        while(temp!=NULL)
        {
            printf("%fx^%d",temp->coeff,temp->expo);
            if(temp->next !=NULL)
            {
                printf(" + ");
            }
            temp = temp->next;
        }
    }
struct node* create(struct node * head)
{
    float coeff;
    int n,expo; 
    printf("Enter the number of terms in the polynomial\n");
    scanf("%d",&n);
    for(int i = 1; i<=n;i++)
    {
        printf("Enter the coefficient of term %d: \n",i);
        scanf("%f",&coeff);
        printf("Enter the exponent of term %d: \n",i);
        scanf("%d",&expo);
        head = insertion(head,coeff,expo);
    }
    return head;
}
struct node * addition(struct node * head1,struct node * head2,struct node * result)
{
    struct node * temp1 = head1;
    struct node * temp2 = head2;
    struct node * temp3 = NULL;
    while(temp1 !=NULL && temp2 !=NULL)
    {
        struct node * new = malloc(sizeof(struct node));
        if(temp1->expo == temp2->expo)
        {
            new->expo = temp1->expo;
            new->coeff = temp1->coeff + temp2->coeff;
            temp1 = temp1->next;
            temp2 = temp2->next;
        }else if(temp1->expo>temp2->expo)
        {
            new->expo = temp1->expo;
            new->coeff = temp1->coeff;
            temp1 = temp1->next;
        }
        else
        {
            new->expo = temp2->expo;
            new->coeff = temp2->coeff;
            temp2 = temp2->next;
        }
        new->next = NULL;
        if(result==NULL)
        {
            result = new;
            temp3 = result; 
        }else{
            temp3->next = new;
            temp3 = new; 
        }
    }
    while(temp1!=NULL)
    {
        struct node * new = malloc(sizeof(struct node));
        new->coeff = temp1->coeff;
        new->expo = temp1->expo;
        new->next = NULL;
        temp3->next = new;
        temp3 = new;
        temp1 = temp1->next;
    }
    while(temp2!=NULL)
    {
        struct node * new = malloc(sizeof(struct node));
        new->coeff = temp2->coeff;
        new->expo = temp2->expo;
        new->next = NULL;
        temp3->next = new;
        temp3 = new;
        temp2= temp2->next;
    }
    return result;
}
int main()
{
    struct node* head1 = NULL;
    struct node* head2 = NULL;
    struct node* result = NULL;
    printf("Enter details of 1st polynomial\n");
    head1 = create(head1);
    printf("Enter details of 2nd polynomial\n");
    head2 = create(head2);
    result = addition(head1,head2,result);
    traverse(result);
    return 0;
}