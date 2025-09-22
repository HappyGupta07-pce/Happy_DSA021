#include <iostream>
using namespace std;
int arr[5] = {23, 1, 10, 5, 2};
void Selection_Sort()
{
    for (int i = 0; i <= 3; i++)
    {
        int min = i;
        for (int j = i + 1; j <= 4; j++)
        {
            if (arr[min] > arr[j])
            {
                min = j;
            }  
        }
            swap(arr[min], arr[i]);
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
    Selection_Sort();
    display();
    return 0;
}