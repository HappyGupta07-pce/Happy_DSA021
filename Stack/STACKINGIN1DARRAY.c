#include <stdio.h>
#include <stdbool.h>
int size = 10;
int stack[10];
int top = -1;
bool isFull() {
    return top == size - 1;
}
bool isEmpty() {
    return top == -1;
}
void push(int val) {
    if (isFull()) {
        printf("Overflow\n");
    } else {
        top = top + 1;
        stack[top] = val;
    }
}
int pop() {
    if (isEmpty()) {
        printf("Underflow\n");
        return -1; 
    } else {
        int v = stack[top];
        top = top - 1;
        return v;
    }
}
void display() {
    if (isEmpty()) {
        printf("Stack is empty\n");
        return;
    }
    for (int i = 0; i <= top; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}
int peek() {
    if (isEmpty()) {
        printf("Stack is empty\n");
        return -1;
    }
    return stack[top];
}
int main() {
    push(10);
    push(20);
    printf("Top element is %d\n", peek());
    printf("Popped element is %d\n", pop());
    display();
    return 0;
}