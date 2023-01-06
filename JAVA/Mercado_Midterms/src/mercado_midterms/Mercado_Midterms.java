/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado_midterms;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class Mercado_Midterms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
     BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
     
     double num1 = 0, num2 = 0, results = 0, gcd = 0, n1 = 0, n2 = 0, a1 = 0, a2 = 0;
     int option ;
     
     
    do{
      System.out.println("[1] Odd or even ");
      System.out.println("[2] Decimal value of fraction ");
      System.out.println("[3] Lowest term of a fraction");
      System.out.println("[4] exit ");
      
      System.out.print("Enter a number: ");
      option = Integer.parseInt(br.readLine());
     
      switch(option) {
         case 1:
             System.out.println(" "); 
             System.out.println("odd or even ");    
             System.out.println("Enter a number: ");    
             num1 = Double.parseDouble(br.readLine());
                      
           
             if ( num1 % 2 == 0 )
             System.out.println("Entered number " +num1 + " is even");
             else
             System.out.println("Entered number " +num1 + " is odd");
             System.out.println(" ");
             break;        
         case 2:
             System.out.println(" "); 
             System.out.println("Decimal value of fraction ");            
             System.out.print("Enter Numerator: ");    
             num1 = Double.parseDouble(br.readLine());
             System.out.print("Enter Denominator: ");    
             num2 = Double.parseDouble(br.readLine());
             
             results = num1/num2;
             
             System.out.println(" ");
             System.out.println("Decimal value: " + results); 
             System.out.println(" ");
             break;
         case 3:
             System.out.println(" "); 
             System.out.println("Lowest term of a fraction ");            
             System.out.print("Enter Numerator: ");    
             num1 = Double.parseDouble(br.readLine());           
             System.out.print("Enter Denominator: ");    
             num2 = Double.parseDouble(br.readLine());
             
             a1 = num1;
             a2 = num2;
             
             while(num1 != num2){
                 if (num1 > num2){
                     num1 = num1 - num2;                           
                 } else 
                     num2 = num2 - num1;
                     gcd = num2;
             }
             a1 = a1/gcd;
             a2 = a2/gcd;
             
             System.out.println(" "); 
             System.out.println("lowest term " + a1 + "/" + a2);
             System.out.println(" "); 
             break;  
         case 4:
             System.exit(0);
             
      } 
    } while (option == 1 || option == 2 || option == 3 || option == 4);
              
       
         
         
         
     
     
    
     
     
     
   
          
      
     
      
     
    }
    
}
