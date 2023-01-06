#include <iostream>
#include <conio.h>

using namespace std;
main(){
	
	int seconds, minutes, hours;
	
	do{
		cout<<"Number of Seconds:";
		cin>> seconds;
		
	}while (seconds<0);
	
	minutes = seconds/60;
	seconds = seconds%60;
	hours = minutes/60;
	minutes = minutes%60;
	
	
	cout << "Number of hours " << hours <<endl;
	cout << "Number of minutes " << minutes<<endl;
	cout << "Number of Seconds " << seconds<<endl;
	
	
	
	
	
}
