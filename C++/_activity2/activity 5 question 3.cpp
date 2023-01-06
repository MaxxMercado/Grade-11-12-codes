 #include<iostream>
 
 using namespace std;
 
 int main (){
 	
 	 cout << "Input three values"<<endl;
 double a,b,c,sum,diff,sum2,avg,sqr ;
 cin>>a>>b>>c;
 sum = a+b+c;
 sum2 = b+c;
 diff = a-b ;
 avg = sum/3;
 sqr = sum2*sum2;
 cout<<"Difference of the first and second is "<<diff<<endl;
 cout<<"Square of the sum of the second and third value is "<<sqr<<endl; 
 cout<<"The average of the three value is "<<avg<<endl;
 	
 	
 }
 
 
