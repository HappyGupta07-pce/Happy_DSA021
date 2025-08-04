#include<iostream>
using namespace std;
int q[100];
int front =-1;
int rear =-1;
int size = 4;
int isfull()
{
 if(rear==size-1)
 {
    return 1;
 }
 else
 {
    return 0;
 }
 }
 int empty()
 {
    if(front == -1 || front > rear)
    {
        return 1;
    }
    else
    {
        return 0;
    }
 }
 int enque(int value)
 {
    if(isfull())
    {
        cout<<"overflow\n"<<endl;
       return 0;
    }
     if(front == -1)
        front = 0;
    {
rear = rear + 1;
q[rear] = value;
    }
    return 1;
 }
 int dequeue()
 {
    if(empty())
        {cout<<"underflow\n"<<endl;
        return 0;
        }
    else{
        int ele=q[front];
        front=front+1;
        cout<<ele<<" deleted \n";
        return 0;
    }
 }
 void display()
 {
    int i;
    if(empty())
    {
        cout<<"queue is empty\n";
        return;
    }
    
       i=front;
    
    while(1)
    {
        cout<<q[i]<<endl;
        if(i==rear)
        break;
         i=i+1;
    }
   
 }
int main()
{
   enque(2);
   enque(3);
   display();
   dequeue();
   display();
   return 0;
}