#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *left;
    struct node *right;
};
struct node *create(int data)
{
    struct node *temp = malloc(sizeof(struct node));
    temp->data = data;
    temp->left = NULL;
    temp->right = NULL;
    return temp;
}
void inorder(struct node *root)
{
    if (root != NULL)
    {
        inorder(root->left);
        printf("%d ", root->data);
        inorder(root->right);
    }
}
// DELETION OF A NODE IN BINARY SEARCH TREE
struct node *inorderpre(struct node *node)
{
    struct node *temp = node->left;
    while (temp->right != NULL)
    {
        temp = temp->right;
    }
    return temp;
}
struct node *deletenode(struct node *root, int value)
{
    struct node *temp = root;

    // base condition of the recursion
    if (temp == NULL)
    {
        return NULL;
    }
    else if (temp->left == NULL && temp->right == NULL)
    {
        free(temp);
        return NULL;
    }

    if (temp->data < value)
    {
        temp->right = deletenode(temp->right, value);
    }
    else if (temp->data > value)
    {
        temp->left = deletenode(temp->left, value);
    }
    else
    {
        struct node *ipre = inorderpre(temp);
        temp->data = ipre->data;
        temp->left = deletenode(temp->left, ipre->data);
    }
    return temp;
}

// struct node * inorderpre(struct node * root)
// {
//     root= root->left;
//     while(root->right!=NULL){
//         root = root->right;
//     }
//     return root;
// }
// struct node * deletenode(struct node * root,int value)
// {
//     if(root==NULL)
//     {
//         return NULL;
//     }

//     //Base condition of the recursion calls
//     if(root->left == NULL && root->right == NULL)
//     {
//         free(root);
//         return NULL;
//     }

//     //searching for the node to be deleted
//     if(value<root->data)
//     {
//         root->left = deletenode(root->left,value);
//     }
//     else if(value>root->data)
//     {
//         root->right = deletenode(root->right,value);
//     }

//     //deleting strategy when the node is found
//     else
//     {
//         struct node * ipre = inorderpre(root);
//         root->data = ipre->data;
//         root->left = deletenode(root->left,ipre->data);
//     }
//     printf("\n");
//     return root;
// }
void main()
{
    struct node *p = create(5);
    struct node *p1 = create(3);
    struct node *p2 = create(6);
    struct node *p3 = create(1);
    struct node *p4 = create(4);

    p->left = p1;
    p->right = p2;
    p1->left = p3;
    p1->right = p4;

    inorder(p);
    printf("\n");
    // calling deleting function: type 1
    p = deletenode(p, 6);
    printf("\n");
    inorder(p);
    // calling deleting fuction: type 2
    deletenode(p, 1);
    printf("\n");
    inorder(p);
}