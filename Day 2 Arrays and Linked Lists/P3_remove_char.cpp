// write a program to remove all characters from a string except alphabets 
#include <iostream>
using namespace std;
int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);
    cout << "String after removing all characters except alphabets: ";
    for (int i = 0; i < str.length(); i++) {
        if ((str[i] >= 'a' && str[i] <= 'z') || (str[i] >= 'A' && str[i] <= 'Z')) {
            cout << str[i];
        }
    }
    cout << endl;
    return 0;
}

