#include<stdio.h>
#include<stdlib.h>
#include <stdbool.h>
struct node{
    int data;
    struct node * left;
    struct node * right;
};
struct node * create(int key)
{
    struct node * temp = malloc(sizeof(struct node));
    temp->data = key;
    temp->left = NULL;
    temp->right = NULL;

}
void inorder(struct node * root)
{
    if(root!=NULL)
    {
        inorder(root->left);
        printf("%d ",root->data);
        inorder(root->right);
    }
}

//RECURSIVE SEARCHING KEY IN THE BINARY SEARCH TREE
bool recSearch(struct node*root,int value)
{
    struct node*temp = root;
    if(temp == NULL)
    {
        return false;
    }else{
        if(temp->data ==value)
        {
            return true;
        }
        else if(temp->data<value)
        {
            return recSearch(temp->right,value);
        }else{
            return recSearch(temp->left,value);
        }
    }
}
// struct node * search(struct node * root,int key)
// {
//     if(root!=NULL)
//     {
//         if(root->data==key)
//         {
//             return root;
//         }
//         else if(root->data < key)
//         {
//             return search(root->right,key);
//         }
//         else
//         {
//             return search(root->left,key);
//         }
//     }
// }

//ITERATIVE SEARCHING OF ELEMET IN THE BST
bool iteSearch(struct node*root,int value)
{
    struct node* temp = root;
    while(temp!=NULL)
    {
        if(temp->data == value)
        {
            return true;
        }else if(temp->data < value)
        {
            temp = temp->right;
        }
        else{
            temp = temp->left;
        }
    }
    return false;
}
void main()
{
    struct node * p = create(50);
    struct node * q = create(40);
    struct node * r = create(60);
    struct node * s = create(20);
    struct node * t = create(45);
    struct node * u = create(55);
    struct node * v = create(70);

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
    
    // inorder(p);

    // struct node * result = search(p,50);
    // if(result==NULL)
    // {
    //     printf("Element not found in the given BST\n");
    // }
    // else
    // {
    //     printf("Element found\n");
    // }
    if(recSearch(p,41))
    {
        printf("Element found in the given BST\n");
    }
    else
    {
        printf("Element not found\n");
    }
    if(iteSearch(p,41))
    {
        printf("Element found in the given BST\n");
    }
    else
    {
        printf("Element not found\n");
    }
}