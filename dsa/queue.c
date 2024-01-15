#include <stdio.h>
#include <stdlib.h>

struct queue
{
    int size;
    int front;
    int rear;
    int *arr;
};

int isEmpty(struct queue *q)
{
    if (q->rear == q->front)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

int isFull(struct queue *q)
{
    if (q->rear == q->size - 1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void enqueue(struct queue *q, int val)
{
    if (isFull(q))
    {
        printf("The Queue is full\n");
    }
    else
    {
        q->rear++;
        q->arr[q->rear] = val;
        printf("%d added to the queue\n", val);
    }
}

void dequeue(struct queue *q)
{
    int a = -1;
    if (isEmpty(q))
    {
        printf("The Queue is empty\n");
    }
    else
    {
        q->front++;
        a = q->arr[q->front];
        printf("%d dequeued from the queue\n", a);
    }
}

void display(struct queue *q)
{
    if (isEmpty(q))
    {
        printf("The Queue is empty. Nothing to display\n");
    }
    else
    {
        for (int i = q->front + 1; i <= q->rear; i++)
        {
            printf("%d\t", q->arr[i]);
        }
        printf("\n");
    }
}

int main()
{
    struct queue *q = (struct queue *)malloc(sizeof(struct queue));
    q->size = 10;
    q->front = q->rear = -1;
    q->arr = (int *)malloc(q->size * sizeof(int));
    int choice, val;
    do
    {
        printf("\n1. Enqueue\n");
        printf("2. Dequeue\n");
        printf("3. Display\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf(" +%d", &choice);

        switch (choice)
        {
        case 1:
            printf("Enter the value to enqueue: ");
            scanf("%d", &val);
            enqueue(q, val);
            break;
        case 2:
            dequeue(q);
            break;
        case 3:
            display(q);
            break;
        case 4:
            printf("Exiting...\n");
            break;
        default:
            printf("Invalid choice. Please enter a valid option.\n");
        }
    } while (choice != 4);

    return 0;
}