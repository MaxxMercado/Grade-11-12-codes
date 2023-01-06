#include<iostream>
#include <string>  
using namespace std;
 
int main (){
string course;
double enrol;

cout << "Enter course title:" ;
getline (cin,course);

cout << "Enter number of enrollees:" ;
cin >> enrol ;
 
if (enrol <= 3 ) {
 	cout << "Remark Dissolved";
 }
else if (enrol > 3 && enrol < 10 ){
	cout << "Remark Open ";
}
else if (enrol = 10 ){
	cout << "Remark  Closed ";
}

else {cout << "Remark Invalid";
}

}





