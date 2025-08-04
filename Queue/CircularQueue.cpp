#include<iostream>
using namespace std;
int front = -1;
int rear = -1;
int size = 10;
int que[100];
bool isFull(){
    return((rear + 1) %size == front);
    cout<<"Overflow"<<endl;    
}
bool isEmpty(){
    return(front == -1);
    cout<<"Underflow"<<endl;
}
void enqueue(int v){
    if(isFull()){
        cout<<"Element cant be inserted"<<endl;
    }
    if(front == -1){
        front = 0;
        rear = 0;
    }
    else {
        rear = (rear + 1) % size;
        }
        que[rear] = v;
        cout<<"Element inserted: "<<v<<endl;
}
void dequeue(){
    if(isEmpty()){
        cout<<"No element"<<endl;
    }
    if(front == rear){// One element condition .
        front = -1;
        rear = -1;
        return;
    }
    int ele = que[front];
    front = (front + 1) % size ;
    cout<<"Element deleted: "<<ele<<endl;
}
void display(){
    for(int i = front; i <= rear; i++){
        cout<<que[i]<<"  "<<endl;
    }
}
int main(){
    enqueue(10);
    enqueue(20);
    enqueue(30);
    enqueue(40);
    enqueue(50);
    enqueue(60);
    display();
    dequeue();
    display();
    enqueue(60);
    enqueue(70);
    enqueue(70);
    display();
    return 0;
}
    