#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *next;
};

void traversal(struct node *ptr) {
    while (ptr != NULL) {
        printf("%d--> ", ptr->data);
        ptr = ptr->next;
    }
    printf("NULL\n");
}

struct node *insertAtFirst(struct node *head, int data) {
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    ptr->data = data;
    ptr->next = head;
    head = ptr;
    printf("%d inserted at the beginning\n", ptr->data);
    return head;
}

struct node * insertAtIndex(struct node *head, int data, int index) {
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p = head;
    int i = 0;

    while (i < index - 1 && p != NULL) {
        p = p->next;
        i++;
    }

    if (p == NULL) {
        printf("Invalid index. Cannot insert.\n");
    } else {
        ptr->data = data;
        ptr->next = p->next;
        p->next = ptr;
        printf("%d inserted at position %d\n", ptr->data, index);
    }
    return head;
}

struct node * insertAtEnd(struct node *head, int data) {
    struct node *ptr = (struct node *)malloc(sizeof(struct node));
    struct node *p = head;
    ptr->data = data;
    ptr->next = NULL;

    if (head == NULL) {
        head = ptr;
    } else {
        while (p->next != NULL) {
            p = p->next;
        }
        p->next = ptr;
    }

    printf("%d inserted at the end\n", ptr->data);
}

struct node *deleteAtFirst(struct node *head){
    struct node *ptr=head;
    head=head->next;
    free(ptr);
    return head;
}

struct node *deleteAtIndex(struct node *head, int pos){
    struct node *p=head;
    struct node *q=head->next;
    for(int i=0;i<pos-1;i++){
        p=p->next;
        q=q->next;
    }
    p->next=q->next;
    free(q);
    return head;
}

struct node *deleteAtEnd(struct node *head){
    struct node *p=head;
    struct node *q=head->next;
    while(q->next!=NULL){
        p=p->next;
        q=q->next;
    }
    p->next=NULL;
    free(q);
    return head;
}

int main() {
    struct node *head = NULL;
    int choice, val, pos;

    do {
        printf("\n1. Insert at beginning\n");
        printf("2. Insert at an index\n");
        printf("3. Insert at end\n");
        printf("4. Display\n");
        printf("5. Delete at beginning\n");
        printf("6. Delete at an index\n");
        printf("7. Delete at end\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf(" %d", &choice);

        switch (choice) {
            case 1:
                printf("Enter the value to insert: ");
                scanf("%d", &val);
                head = insertAtFirst(head, val);
                break;
            case 2:
                printf("Enter the value to insert: ");
                scanf("%d", &val);
                printf("Enter the position: ");
                scanf("%d", &pos);
                head=insertAtIndex(head, val, pos);
                break;
            case 3:
                printf("Enter the value to insert: ");
                scanf("%d", &val);
                head=insertAtEnd(head, val);
                break;
            case 4:
                traversal(head);
                break;
            case 5:
                head=deleteAtFirst(head);
                printf("Element deleted successfully\n");
                break;
            case 6:
                printf("Enter the position: ");
                scanf("%d", &pos);
                head=deleteAtIndex(head, pos);
                printf("Element deleted successfully from position %d\n", pos);
                break;
            case 7:
                head=deleteAtEnd(head);
                printf("Element deleted successfully\n");
                break;
            case 8:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice. Please enter a valid option.\n");
        }
    } while (choice != 8);

    return 0;
}
