#include<stdio.h>
#include<stdlib.h>

struct stack {
    int size;
    int top;
    char *arr;
};

int isEmpty(struct stack* ptr) {
    return ptr->top == -1;
}

int isFull(struct stack* ptr) {
    return ptr->top == ptr->size - 1;
}

void push(struct stack *ptr, char val) {
    if (isFull(ptr)) {
        printf("Stack Overflow\n");
    } else {
        ptr->top++;
        ptr->arr[ptr->top] = val;
    }
}

void pop(struct stack *ptr) {
    if (isEmpty(ptr)) {
        printf("Stack Underflow\n");
    } else {
        char val = ptr->arr[ptr->top];
        ptr->top--;
    }
}

void display(struct stack *ptr) {
    for(int i = 0; i <= ptr->top; i++) {
        printf("%c\n", ptr->arr[i]);
    }
}

int parenthesisMatch(char *exp) {
    struct stack* sp = (struct stack*)malloc(sizeof(struct stack));
    sp->size = 100;
    sp->top = -1;
    sp->arr = (char *)malloc(sp->size * sizeof(char));

    for(int i = 0; exp[i] != '\0'; i++) {
        if(exp[i] == '(') {
            push(sp, '(');
        } else if(exp[i] == ')') {
            if(isEmpty(sp)) {
                free(sp->arr);
                free(sp);
                return 0;
            }
            pop(sp);
        }
    }

    int result = isEmpty(sp);
    free(sp->arr);
    free(sp);
    return result;
}

int main() {
    char *exp = "((8*3)+(24/4)))";

    if(parenthesisMatch(exp)) {
        printf("Expression is correct\n");
    } else {
        printf("Expression not valid\n");
    }
    return 0;
}
