#include<stdio.h>
#include<stdlib.h>

struct stack{
    int size;
    int top;
    int *arr;
};

int isEmpty(struct stack* ptr){
    if(ptr->top==-1){
        return 1;
    }
    else{
        return 0;
    }
}

int isFull(struct stack* ptr){
    if(ptr->top==ptr->size-1){
        return 1;
    }
    else{
        return 0;
    }
}

void push(struct stack *ptr, int val){
    if (isFull(ptr)){
        printf("Stack Overflow\n");
    }
    else{
        ptr->top++;
        ptr->arr[ptr->top]=val;
    }
}

void pop(struct stack *ptr){
    if (isEmpty(ptr)){
        printf("Stack Underflow\n");
    }
    else{
        int val=ptr->arr[ptr->top];
        ptr->top--;
        printf("Popped %d successfully", val);
    }
}

void display(struct stack *ptr){
    for(int i=0;i<=ptr->top;i++){
        printf("%d\n",ptr->arr[i]);
    }
}

int main(){
    
    struct stack *sp=(struct stack *)malloc(sizeof(struct stack));
    sp->size=10;
    sp->top=-1;
    sp->arr=(int *)malloc(sp->size*sizeof(int));

    push(sp,43);
    push(sp,34);
    push(sp,56);
    push(sp,65);
    push(sp,67);
    push(sp,76);
    push(sp,99);
    display(sp);




    return 0;
}