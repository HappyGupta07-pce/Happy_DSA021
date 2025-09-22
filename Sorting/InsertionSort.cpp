#include <iostream>
using namespace std;
int arr[5] = {23, 1, 10, 5, 2};
void Insertion_Sort()
{
    for (int i = 0; i <= 4; i++)
    {
        int j = i;
        while (j > 0 && arr[j - 1] > arr[j])
        {
            swap(arr[j - 1], arr[j]);
            j--;
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
    Insertion_Sort();
    display();
    return 0;
}