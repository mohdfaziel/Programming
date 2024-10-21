#include <stdio.h>
#include <stdlib.h>
#define MAX 5
struct cqueue
{
    int size;
    int f;
    int r;
    int *arr;
};
int isfull(struct cqueue *ptr)
{
    if (ptr->f == 0 && ptr->r == ptr->size - 1 || ptr->f == ptr->r + 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int isempty(struct cqueue *ptr)
{
    if (ptr->f == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void enqueue(struct cqueue *ptr, int element)
{
    if (isfull(ptr))
    {
        printf("Queue overflow\n");
        return;
    }
    if (ptr->f == -1)
    {
        ptr->f = ptr->r = 0;
    }
    else if (ptr->r == ptr->size - 1)
    {
        ptr->r = 0;
    }
    else
    {
        ptr->r++;
    }
    ptr->arr[ptr->r] = element;
}
int dequeue(struct cqueue *ptr)
{
    if (isempty(ptr))
    {
        printf("Queue underflow\n");
        return -1;
    }
    else
    {
        int value = ptr->arr[ptr->f];
        if (ptr->f == ptr->r)
        {
            ptr->r = ptr->f = -1;
        }
        else if (ptr->f == ptr->size - 1)
        {
            ptr->f = 0;
        }
        else
        {
            ptr->f++;
        }
        return value;
    }
}
void display(struct cqueue *ptr)
{
    int front = ptr->f;
    int rear = ptr->r;
    if (front == -1)
    {
        printf("Queue empty\n");
        return;
    }
    printf("Elements of the queue are as follows\n");
    if (front <= rear)
    {
        while (front <= rear)
        {
            printf("\n%d", ptr->arr[front]);
            front++;
        }
    }
    else
    {
        while (front <= ptr->size - 1)
        {
            printf("\n%d", ptr->arr[front]);
            front++;
        }
        front = 0;
        while (front <= rear)
        {
            printf("\n%d", ptr->arr[front]);
            front++;
        }
    }
    printf("\n");
}
void main()
{
    struct cqueue *cq = (struct cqueue *)malloc(sizeof(struct cqueue));
    cq->size = MAX;
    cq->f = cq->r = -1;
    cq->arr = (int *)malloc(cq->size * sizeof(int));

    printf("Inserting elements to the queue\n");
    enqueue(cq, 11);
    enqueue(cq, 12);
    enqueue(cq, 13);
    enqueue(cq, 14);
    enqueue(cq, 15);
    enqueue(cq, 16);

    printf("Deleting elements from the queue\n");
    printf("Element removed %d:\n", dequeue(cq));
    printf("Element removed %d:\n", dequeue(cq));
    printf("Element removed %d:\n", dequeue(cq));
    printf("Element removed %d:\n", dequeue(cq));
    printf("Element removed %d:\n", dequeue(cq));
    printf("Element removed %d:\n", dequeue(cq));

    printf("Displaying elements from the queue\n");
    display(cq);
}