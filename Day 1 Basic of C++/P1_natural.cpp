// sum of N natural numbers ?
#include<iostream>
using namespace std;
int main() {
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    int sum = (n*(n+1))/2;
    cout<<"Sum of first "<<n<<" natural numbers is: "<<sum;
    return 0;
}