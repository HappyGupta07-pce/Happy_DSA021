#include<stdio.h>
#include<stdbool.h>
int stack[10];
int size = 10;
int top = -1;
bool isFull(){
   return top == size - 1;
}
bool isEmpty(){
   return top == -1;
}
void push(int val){
    if (isFull())
    printf("Overflow\n");
else{
top = top + 1;
stack[top]=val;}}
int pop(){
if (isEmpty()){
    printf("Underflow\n");
    return 0;
}
else{
int v = stack[top];
top = top - 1;
return v;
}}
int peek(){
    if (isEmpty()){
    printf("Underflow\n");
    return 0;
    return stack[top];
}}
void display(){
    if(isEmpty()){
    printf("Stack is Empty");
    return;
}
else{
int i;
for(i=0;i<=top;i++){
printf("%d\n",stack[i]);
    }
}}
int main(){
push(10);
push(20);
push(30);
push(40);
pop();
display();
return 0;
}
