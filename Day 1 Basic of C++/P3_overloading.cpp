#include <iostream>
using namespace std;
double area(double radius) {
    return 3.14159 * radius * radius;
}

double area(double length, double width) {
    return length * width;
}

int main() {
    double circleRadius, rectangleLength, rectangleWidth;

    // Input for circle
    cout << "Enter the radius of the circle: ";
    cin >> circleRadius;
    cout << "Area of the circle: " << area(circleRadius) << endl;

    // Input for rectangle
    cout << "Enter the length and width of the rectangle: ";
    cin >> rectangleLength >> rectangleWidth;
    cout << "Area of the rectangle: " << area(rectangleLength, rectangleWidth) << endl;

    return 0;
}
