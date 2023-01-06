#include <iostream> 
#include <conio.h> 


using namespace std;

main (){
	
int month;
	
cout << "--List of months--" << endl; 
cout << "[1] January " << endl;
cout << "[2] February " << endl;
cout << "[3] March" << endl;
cout << "[4] April" << endl;
cout << "[5] May " << endl;
cout << "[6] June " << endl;
cout << "[7] July" << endl;
cout << "[8] August" << endl;
cout << "[9] September" << endl;
cout << "[10] October " << endl;
cout << "[11] November" << endl;
cout << "[12] December" << endl;
cout << "Enter your choice:";
cin >> month; 


switch(month){
	case 1: 
		cout << "January has 31 days";
		break; 
	case 2: 
		cout << "February has 29 days";
		break; 
	case 3: 
		cout << "March has 31 days";
		break; 
	case 4: 
		cout << "April has 30 days";
		break; 
	case 5: 
		cout << "May has 31 days";
		break; 
	case 6: 
		cout << "June has 30 days";
		break; 
	case 7: 
		cout << "July has 31 days";
		break; 
	case 8: 
		cout << "August has 31 days";
		break; 
	case 9: 
		cout << "September has 30 days";
		break; 
	case 10: 
		cout << "October has 31 days";
		break; 
	case 11: 
		cout << "November has 30 days";
		break; 
	case 12: 
		cout << "December has 31 days";
		break; 				
	default:
		cout << "invalid number";
		
}

				
}


