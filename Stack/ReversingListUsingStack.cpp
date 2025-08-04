#include<iostream>
using namespace std;
int arr[5] = {1, 2, 3, 4, 5};
int reverse(int arr[5]){
        int stack[5], top = -1;
        for(int i = 0; i < 5; i++) {
            stack[++top] = arr[i];
        }
        for(int i = 0; i < 5; i++) {
            arr[i] = stack[top--];
        }
    }
        void display(){
        for(int i = 0; i < 5; i++) {
            cout<<arr[i]<<" ";
        }}
int main(){
    cout<<"Original Array: ";
        for(int i = 0;i < 5;i++) {
        cout<<arr[i]<<" "<<endl;
    }
    reverse(arr);
    cout<<"Reversed Array: ";
    display();
    return 0;
}