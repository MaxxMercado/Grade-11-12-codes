#include <iostream>
using namespace std;

int main(){

int a[10], num, i;

cout << "Enter Decimal: ";
cin >> num; 

if (num >= 0 && num <= 255 ) {
	for (i=0; num>0; i++){
		a[i] = num%2;
		num = num/2;
	}
	cout << "Binary = ";
	for (i = i - 1; i >= 0; i--){
	cout << a[i];
	}
}

else 
cout <<"Ivalid";
return 0;	
	
	
	
	
}
