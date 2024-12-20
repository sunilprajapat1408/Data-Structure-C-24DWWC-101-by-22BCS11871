// write a program to calculate LCM of two number
#include <iostream>
using namespace std;
int main() {
    int num1, num2, lcm;
    cout << "Enter two numbers: ";
    cin >> num1;
    cin >> num2;
    lcm = (num1 > num2) ? num1 : num2;
    while (true) {
        if (lcm % num1 == 0 && lcm % num2 == 0) {
            cout << "LCM of " << num1 << " and " << num2 << " is " << lcm << endl;
            break;
        }
        lcm++;
    }
    return 0;
}

