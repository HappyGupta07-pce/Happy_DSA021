#include<iostream>
using namespace std;
int TOH (int n, char a, char b,char c){
    if(n==1){
        cout<<a<<"->"<<c<<endl;
        return 0;
     } 
    
    TOH(n-1,a,c,b);{
    cout<<a<<"->"<<c<<endl;
    return 0;
}
    
    
    TOH(n-1,b,a,c);{
    cout<<b<<"->"<<c<<endl;
       return 0;
}
}
int main(){
    TOH(3,'A','B','C');
    return 0;
}