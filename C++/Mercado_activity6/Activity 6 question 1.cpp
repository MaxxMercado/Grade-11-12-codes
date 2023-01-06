#include<iostream>
#include <string>  
using namespace std;
 
int main (){
string name;
double bsalary, lservice, spay; 

cout << "Enter employee's name:" ;
getline (cin,name);

cout << "Enter basic salary:";
 cin >> bsalary;

cout << "Enter length of service:";
 cin >> lservice;

if (lservice <= 5 && lservice > 0 ) {
	spay = (bsalary * 1.5) * lservice;
	cout << "Employee name" << name << endl;
  cout << "Your seperation pay:" << spay << endl;
}
 
else if (lservice > 5 && lservice < 11 ) {
	spay = (bsalary * 2.0) * lservice;
	cout << "Employee name" << name << endl;
  cout << "Your seperation pay:" << spay << endl;
}

else if (lservice > 10 && lservice < 16) {
	spay = (bsalary * 2.5) * lservice;
	cout << "Employee name" << name << endl;
  cout << "Your seperation pay:" << spay << endl;
}
  
else if (lservice > 15 ) {
   spay = (bsalary * 3.0) * lservice;
	cout << "Employee name " <<name << endl;
  cout << "Your seperation pay:" << spay << endl;
}

else { cout << "Invalid input"; 
}


 }
