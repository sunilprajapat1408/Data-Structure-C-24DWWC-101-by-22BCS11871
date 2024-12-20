#include <iostream>
#include <string>
using namespace std;

class Employee {
protected:
    string name;
    int id;
    double salary;

public:
    void setDetails(string n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void displayDetails() {
        cout << "Name: " << name << ", ID: " << id << ", Salary: " << salary << endl;
    }
};

class Manager : public Employee {
private:
    string department;

public:
    void setDepartment(string dept) {
        department = dept;
    }

    void displayDetails() {
        Employee::displayDetails();
        cout << "Department: " << department << endl;
    }
};

class Intern : public Employee {
private:
    int internshipDuration;

public:
    void setDuration(int duration) {
        internshipDuration = duration;
    }

    void displayDetails() {
        Employee::displayDetails();
        cout << "Internship Duration: " << internshipDuration << " months" << endl;
    }
};

int main() {
    Manager manager;
    manager.setDetails("Aakash", 101, 75000);
    manager.setDepartment("IT");
    manager.displayDetails();

    Intern intern;
    intern.setDetails("Gagan", 201, 15000);
    intern.setDuration(6);
    intern.displayDetails();

    return 0;
}
