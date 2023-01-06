#include <iostream>
#include <conio.h>
using namespace std;

main(){
	int product, num1, num2;
	
	cout<<"Enter interger: ";
	cin>>num1;
	cout<<"Enter interger: ";
	cin>>num2;
	for (int x=0; x<num2; x++){
		product= product + num1;
	}
	
	cout<<"The product is: "<<product<< endl;
	

} 
