#include <stdio.h>
#include <stdlib.h>
int* stack;
int top = -1;
int size;
void create_stack(int ini_size) {
    size = ini_size;
    stack = (int*)malloc(size * sizeof(int));
    if (!stack) {
        printf("Memory not allocated.\n");
    } else {
        printf("Memory is allocated.\n");
    }
}
void push(int val) {
    if (top == size - 1) {
        printf("Overflow\n");
    } else {
        top = top + 1;
        stack[top] = val;
        printf("Pushed: %d\n", val);
    }
}
int pop() {
    if (top == -1) {
        printf("Underflow\n");
        return -1;
    } else {
        int popped = stack[top];
        printf("Popped: %d\n", popped);
        top = top - 1;
        return popped;
    }
}
void display() {
    if (top == -1) {
        printf("Stack is empty\n");
        return;
    }
    printf("Stack elements: ");
    for (int i = 0; i <= top; i++) {
        printf("%d ", stack[i]);
    }
    printf("\n");
}
int main() {
    create_stack(5);
    push(10);
    push(20);
    push(30);
    push(40);
    push(50);
    push(60); 
    display();
    pop();
    display();
    free(stack);  
    return 0;
}
