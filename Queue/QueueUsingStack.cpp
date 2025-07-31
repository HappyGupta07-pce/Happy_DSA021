#include<iostream>
using namespace std;
int size = 10;
int top1 = -1;
int top2 = -1;
int s1[10];
int s2[10];
int count=0;
void push1(int val){
    if(top1==size-1){
        cout<<"Overflow"<<endl;
    }
    else {
        top1 = top1 + 1;
        s1[top1]=val;
    }
}
void push2(int val){
    if(top2==size-1){
        cout<<"Overflow"<<endl;
    }
    else{
        top2=top2 + 1;
        s2[top2]=val;
    }
}
int pop1(){
    if(top1==-1){
        cout<<"Underflow"<<endl;
        return 0;
    }
    else{
        int x = s1[top1];
        top1 = top1 - 1;
        return x;
    }
}
int pop2(){
    if(top2==-1){
        cout<<"Underflow"<<endl;
        return 0;
    }
    else{
        int x = s2[top2];
        top2 = top2 - 1;
        return x;
    }
}
void enqueue(int val){
    push1(val);
    count = count + 1;
}
void dequeue(){
    for(int i=0;i<=count;i++){
        int ele1 = pop1();
        push2(ele1);
    }
    for(int i=0;i<=count;i++){
    int ele2 = pop2();
    count=count-1;
    push1(ele2);
}
}
void display(){
    if(top1==-1){
        cout<<"Queue is empty"<<endl;
    }
    else
    for(int i=0;i<=top1;i++){
        cout<<s1[i]<<endl;
    }
}
int main(){
    enqueue(5);
    enqueue(10);
    enqueue(15);
    enqueue(20);
    dequeue();
    display();
    return 0 ;
}