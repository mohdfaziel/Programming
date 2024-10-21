#include<stdio.h>
#include<stdlib.h>
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


struct node * search(struct node * root,int key)
{
    if(root!=NULL)
    {
        if(root->data==key)
        {
            return root;
        }
        else if(root->data < key)
        {
            return search(root->right,key);
        }
        else
        {
            return search(root->left,key);
        }
    }
}

// insertion of new node in the bst
void insert(struct node*root,int value)
{
    struct node*temp = root;
    struct node*prev;
    while(temp!=NULL)
    {
        prev = temp;
        if(temp->data==value)
        {
            printf("Element already present\n");
        }
        else if(temp->data<value)
        {
            temp = temp->right;
        }else{
            temp = temp->left;
        }
    }
    struct node*new = create(value);
    if(prev->data<value)
    {
        prev->right = new;
    }else{
        prev->left = new;
    }
}
// void insert(struct node * root,int key)
// {
//     struct node * prev;
//     struct node * r = root;
//     while(r!=NULL) // when this loop ends prev will be at that node on which's left or right we have to place the key
//     {
//         prev=r; // to keep track of the parent node of root
//         if(r->data==key)
//         {
//             printf("Element already present\n");
//             return;
//         }
//         else if(key<r->data)
//         {
//         r = r->left;
//         }
//         else
//         {
//             r = r->right;
//         }
//     }
//     struct node * ptr = create(key);
//     if(prev->data < key)
//     {
//         prev->right = ptr;
//     }
//     else
//     {
//         prev->left = ptr;
//     }
// }
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

    insert(p,23);
    printf("%d ",p->left->left->right->data); // 23;

    struct node * result = search(p,23);
    if(result==NULL)
    {
        printf("Element not found in the given BST\n");
    }
    else
    {
        printf("Element found\n");
    }
}