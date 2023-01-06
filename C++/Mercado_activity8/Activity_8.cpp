#include <iostream>
#include <conio.h>
#include <string>

using namespace std;

float tui (int unit, int rate){
	return (unit * rate);
}

float bal (int tuit, int dpayment){
	return (tuit - dpayment);
}



main(){
	
	string name;
	
	int ycode, unit, dpayment, rate, tuit, balance, unit2;
	
	cout << "Enter student's name: ";
  	getline (cin,name);
	
	cout << "Enter year code: ";
	cin >> ycode;
	
	cout << "Enter number of units enrolled: ";
	cin >> unit;
	
	cout <<"  "<<endl;
	
	if ( ycode==1 ) {
		cout<<"Student's name: "<<name<<endl;
		
		cout<< "Year name: Freshman"<<endl ;
		
		cout<< "Number of units enrolled: "<<unit<<endl;
		
			if (unit >= 1 && unit < 10) {
				unit2 = 1000;}
			else if (unit >= 10 && unit <16 ){
				unit2 = 1500;
			}
		     else if (unit >= 16 && unit <22 ){
				unit2 = 1500;
			}
		     else unit2 =  2500;
		     
		rate = 400;
		
		tuit = tui(unit, rate);
	    cout<<"Tuition Fee: "<<tuit<<endl;
	    
		dpayment = 1000;
		cout<<"Down payment: "<<dpayment<<endl;
		
		balance = bal(tuit, dpayment);
		cout<<"Balance: "<<balance<<endl;
		
	}
	
	else if  ( ycode==2 ) {
		cout<<"Student's name: "<<name<<endl;
		
		cout<< "Year name: Sophomore "<<endl ;
		
		cout<< "Number of units enrolled: "<<unit<<endl;
		
			if (unit >= 1 && unit < 10) {
				unit2 = 1000;}
			else if (unit >= 10 && unit <16 ){
				unit2 = 1500;
			}
		     else if (unit >= 16 && unit <22 ){
				unit2 = 1500;
			}
		     else unit2 =  2500;
		     
		rate = 350;
		
		tuit = tui(unit, rate);
	    cout<<"Tuition Fee: "<<tuit<<endl;
	    
		dpayment = 1000;
		cout<<"Down payment: "<<dpayment<<endl;
		
		balance = bal(tuit, dpayment);
		cout<<"Balance: "<<balance<<endl;;
	}
	
	else if  ( ycode==3 ) {
		cout<<"Student's name: "<<name<<endl;
		
		cout<< "Year name: Junior "<<endl ;
		
		cout<< "Number of units enrolled: "<<unit<<endl;
		
			if (unit >= 1 && unit < 10) {
				unit2 = 1000;}
			else if (unit >= 10 && unit <16 ){
				unit2 = 1500;
			}
		     else if (unit >= 16 && unit <22 ){
				unit2 = 1500;
			}
		     else unit2 =  2500;
		     
		rate = 300;
		
		tuit = tui(unit, rate);
	    cout<<"Tuition Fee: "<<tuit<<endl;
	    
		dpayment = 1000;
		cout<<"Down payment: "<<dpayment<<endl;
		
		balance = bal(tuit, dpayment);
		cout<<"Balance: "<<balance<<endl;;
		
    }
	else if  ( ycode==4 || ycode==5 ) {
		
		cout<<"Student's name: "<<name<<endl;
		
		cout<< "Year name: Senior "<<endl ;
		
		cout<< "Number of units enrolled: "<<unit<<endl;
		
			if (unit >= 1 && unit < 10) {
				unit2 = 1000;}
			else if (unit >= 10 && unit <16 ){
				unit2 = 1500;
			}
		     else if (unit >= 16 && unit <22 ){
				unit2 = 1500;
			}
		     else unit2 =  2500;
		     
		rate = 280;
		
		tuit = tui(unit, rate);
	    cout<<"Tuition Fee: "<<tuit<<endl;
	    
		dpayment = 1000;
		cout<<"Down payment: "<<dpayment<<endl;
		
		balance = bal(tuit, dpayment);
		cout<<"Balance: "<<balance<<endl;;
	}
	
	else 
	cout << "invalid" ;
	
	
	
}
