#include <iostream> 
#include <string>
using namespace std;

int main() {
 string name;
 double hours, rate, deductions, grosspay, netpay;
 
 cout << "Enter employee's name':" ;
 cin >> name;
 
 cout << "Enter number hours worked:" ;
 cin >> hours; 
 
  cout << "Enter rate per hour:" ;
 cin >> rate; 
 
 cout << "Enter amount of total deductions" ;
 cin >> deductions; 
 
 grosspay = hours * rate; 
 
 netpay = grosspay - deductions; 

 cout << "Name of employee is: " << name << endl; 
 
 cout << "Netpay is: " << netpay << endl ; 
 
}

