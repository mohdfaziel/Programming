// creation, traversal, insertion, deletion, isempty, isfull in queues
#include<stdio.h>
#include<stdlib.h>
struct queue{
    int size;
    int front;
    int rear;
    int *arr;
};
// checking is our queue empty or not
int isempty(struct queue * ptr)
{
    if(ptr->front==ptr->rear)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int isfull(struct queue * ptr)
{
    if(ptr->rear == ptr->size-1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
void enqueue(struct queue * ptr,int element)
{
    if(isfull(ptr))
    {
        printf("Queue overflow\n");
        exit(0);
    }
    else
    {
        ptr->rear = ptr->rear + 1;
        ptr->arr[ptr->rear] = element;
        if(ptr->front == -1)
        {
            ptr->front = 0;
        }
    }
}
int dequeue(struct queue * ptr)
{
    int value;
    if(isempty(ptr))
    {
        printf("Queue underflow\n");
        exit(0);
    }
    else
    {
        value = ptr->arr[ptr->front];
        if(ptr->front == ptr->rear)
        {
            ptr->front= -1;
            ptr->rear=-1;
        }
        else
        {
            ptr->front = ptr->front +1;
        }
    }
    return value;
}
void traverse(struct queue * ptr)
{
    if(ptr->front != -1)
    {
    printf("Elements of the queue are\n");
    for(int i = ptr->front; i<= ptr->rear;i++)
    {
        printf("%d\n",ptr->arr[i]);
    }
    }
    else
    {
        printf("Queue is empty\n");
    }
}
int main()
{
    //creation of the queue
    struct queue * q = (struct queue*)malloc(sizeof(struct queue));
    printf("Enter the size of the queue\n");
    scanf("%d",&q->size);
    q->front = q->rear = -1;
    q->arr = (int*)malloc((q->size)*sizeof(int));

    // inserting some elements
    enqueue(q,1);
    enqueue(q,2);


    //traversing through the queue
    traverse(q);

    // deleting some elements of the queue
    printf("Dequeued element %d\n",dequeue(q));

    //traversing through the queue
    traverse(q);


    free(q->arr);
    free(q);
    return 0;
}