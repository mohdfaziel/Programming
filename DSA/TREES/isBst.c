#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
struct node *create(int key)
{
    struct node *temp = malloc(sizeof(struct node));
    temp->data = key;
    temp->left = NULL;
    temp->right = NULL;
}
void inorder(struct node*head)
{
    struct node*temp = head;
    if(temp!=NULL)
    {
        inorder(temp->left);
        printf("%d,",temp->data);
        inorder(temp->right);
    }
}
int isBst(struct node*root)
{
    static struct node*prev = NULL;
    struct node*temp = root;
    if(temp==NULL)
    {
        return 1;
    }else{
        if(!isBst(temp->left))
        {
            return 0;
        }
        if(prev!=NULL && prev->data>=temp->data)
        {
            return 0;
        }
        prev = temp;
        return isBst(temp->right);
    }
}
void main()
{
    struct node *p = create(50);
    struct node *q = create(40);
    struct node *r = create(60);
    struct node *s = create(20);
    struct node *t = create(45);
    struct node *u = create(55);
    struct node *v = create(70);

    p->left = q;
    p->right = r;

    q->left = s;
    q->right = t;

    r->left = u;
    r->right = v;

    s->left = NULL;
    s->right = NULL;

    t->left = NULL;
    t->right = NULL;

    u->left = NULL;
    u->right = NULL;

    v->left = NULL;
    v->right = NULL;
    inorder(p);
    if(isBst(p))
    {
        printf("\nGiven tree is a BST");
    }
    else{
        printf("\nGiven tree is not a BST");
    }
}