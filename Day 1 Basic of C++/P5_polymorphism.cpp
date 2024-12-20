#include <iostream>
using namespace std;

class Transaction {
public:
    virtual void process(double amount) {
        cout << "Processing a generic transaction of: " << amount << endl;
    }
};

class Deposit : public Transaction {
public:
    void process(double amount) override {
        cout << "Depositing: " << amount << endl;
    }
};

class Withdrawal : public Transaction {
public:
    void process(double amount) override {
        cout << "Withdrawing: " << amount << endl;
    }
};

int main() {
    Transaction* transaction;

    Deposit deposit;
    transaction = &deposit;
    transaction->process(1000.0);

    Withdrawal withdrawal;
    transaction = &withdrawal;
    transaction->process(500.0);

    return 0;
}
