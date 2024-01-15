#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_SIZE 100

int precedence(char op) {
    if (op == '+' || op == '-')
        return 1;
    if (op == '*' || op == '/')
        return 2;
    return 0;
}

void reverse_string(char* str) {
    int length = strlen(str);
    for (int i = 0; i < length / 2; i++) {
        char temp = str[i];
        str[i] = str[length - i - 1];
        str[length - i - 1] = temp;
    }
}

void infix_to_prefix(char* infix, char* prefix) {
    reverse_string(infix);
    char temp[MAX_SIZE];
    int j = 0;
    for (int i = 0; infix[i] != '\0'; i++) {
        if (infix[i] == '(') {
            temp[j++] = ')';
        } else if (infix[i] == ')') {
            temp[j++] = '(';
        } else {
            temp[j++] = infix[i];
        }
    }
    temp[j] = '\0';

    char postfix[MAX_SIZE];
    infix_to_postfix(temp, postfix);
    reverse_string(postfix);
    strcpy(prefix, postfix);
}

void prefix_to_postfix(char* prefix, char* postfix) {
    char stack[MAX_SIZE];
    int top = -1;
    int length = strlen(prefix);
    for (int i = length - 1; i >= 0; i--) {
        if (prefix[i] >= 'a' && prefix[i] <= 'z') {
            stack[++top] = prefix[i];
        } else {
            char op1 = stack[top--];
            char op2 = stack[top--];
            stack[++top] = op1;
            stack[++top] = op2;
            stack[++top] = prefix[i];
        }
    }
    stack[++top] = '\0';
    strcpy(postfix, stack);
}

int main() {
    char infix[MAX_SIZE];
    char prefix[MAX_SIZE];
    char postfix[MAX_SIZE];

    printf("Enter the infix expression: ");
    scanf("%s", infix);

    infix_to_prefix(infix, prefix);
    printf("The prefix expression is: %s\n", prefix);

    printf("Enter the prefix expression: ");
    scanf("%s", prefix);

    prefix_to_postfix(prefix, postfix);
    printf("The postfix expression is: %s\n", postfix);

    return 0;
}
