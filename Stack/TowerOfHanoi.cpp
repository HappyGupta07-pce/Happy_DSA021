#include<iostream>
using namespace std;
void TOH(int n, char a, char b, char c) {
    if (n == 0) {
        return;
    }
    TOH(n - 1, a, c, b);
    cout << a << "->" << c << endl;
    TOH(n - 1, b, a, c);
}
int main() {
int n;
cout << "Enter no. of disks:" << endl;
cin >> n;
TOH(n, 'A', 'B', 'C');
return 0;
}