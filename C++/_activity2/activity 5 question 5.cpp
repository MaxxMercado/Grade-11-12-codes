#include <iostream> 
using namespace std;

int main() {
	
 int amount;
 cout<< "Enter amount of money:"; 
 cin >> amount; cout << endl;
 cout<< "1000: " << amount/1000; cout << endl;
 amount = amount%1000; 
 cout<< "500: " << amount/500; cout << endl;
 amount = amount%500; 
 cout<< "200: " << amount/200; cout << endl;
 amount = amount%200; 
 cout<< "100: " << amount/100; cout << endl;
 amount = amount%100; 
 cout<< "50: " << amount/50; cout << endl;
 amount = amount%50; 
 cout<< "20: " << amount/20; cout << endl;
 amount = amount%20; 
  cout<< "10: " << amount/10; cout << endl;
 amount = amount%10; 
   cout<< "5: " << amount/5; cout << endl;
 amount = amount%5; 
  cout<< "1: " << amount/1; cout << endl;
 amount = amount%1; 
}

