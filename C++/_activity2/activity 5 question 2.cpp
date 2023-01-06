#include <iostream> 
using namespace std;

int main() {
 double midterm, minorA, grade;
 
 cout << "Enter Minor A exam:" ;
 cin >> midterm;
 
 cout << "Enter Midterm exam:" ;
 cin >> minorA; 
 
 minorA = minorA/3; 
 
 midterm = midterm * 2/3;
 
 grade = (minorA + midterm);
 
 cout << "Midterm grade is: " << grade << endl ; 
 
 
}

