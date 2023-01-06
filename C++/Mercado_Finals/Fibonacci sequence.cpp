#include <iostream>
using namespace std;

int main() {
	int n1 = 0, n2 = 1, t = 0, num;
	
	cout << "Enter number: ";
	cin >> num;

	cout <<"Output: " << n1 <<", "<< n2 << ", ";
	
	t = n1 + n2;
	
	while(t <= num) {
		cout << t << ", ";
		n1 = n2;
		n2 = t;
		t = n1 + n2; 
		
	}
	cout << "\n";
	cout << "\n";
	if (num == n2){
		cout << num << " is included in the fibonacci sequence. ";
	}
	else 
		cout << num << " is not included in the fibonacci sequence. ";
} 
