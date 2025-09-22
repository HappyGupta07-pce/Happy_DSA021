#include <iostream>
using namespace std;
int arr[5] = {23, 1, 10, 5, 2};
void Bubble_Sort()
{
    for (int i = 0; i <= 3; i++)
    {
        for (int j = 0; j < 4 - i; j++)
        {
            if (arr[j] > arr[j + 1])
            {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}
void display()
{
    for (int i = 0; i <= 4; i++)
    {
        cout << arr[i] << "  ";
    }
    cout << endl;
}
int main()
{
    cout << "Before Sorting :" << endl;
    display();
    cout << "After Sorting :" << endl;
    Bubble_Sort();
    display();
    return 0;
}