/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.statements.question.pkg2;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class ConditionalStatementsQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception  {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        String Ename, bsalary, lservice;
        double spay;
        
        System.out.println("Enter Employee Name: ");
        Ename = br.readLine();
        
        System.out.println("Enter Basic Salary: ");
        bsalary = br.readLine();
        
        System.out.println("Enter length of service: ");
        lservice = br.readLine();
        
        double bsal = Double.parseDouble(bsalary);
        double lser = Double.parseDouble(lservice);
        
        if(lser <= 5 && lser > 0 ){
            spay = (bsal * 1.5) * lser;
            
            System.out.println("Employees Name: " + Ename);
            System.out.println("Your length of service: " + lser + " years");
            System.out.println("Your seperation pay: " + spay);
     
        }else if (lser > 5 && lser < 11 ){
            spay = (bsal * 2.0) * lser;
            
            System.out.println("Employees Name: " + Ename);
            System.out.println("Your length of service: " + lser + " years");
            System.out.println("Your seperation pay: " + spay);
        }else if (lser > 10 && lser < 16 ){
            spay = (bsal * 2.5) * lser;
            
            System.out.println("Employees Name: " + Ename);
            System.out.println("Your length of service: " + lser + " years");
            System.out.println("Your seperation pay: " + spay);
        }else if (lser > 15){
            spay = (bsal * 3.0) * lser;
            
            System.out.println("Employees Name: " + Ename);
            System.out.println("Your length of service: " + lser + " years");
            System.out.println("Your seperation pay: " + spay);
        }else{
            System.out.println("INVALID INPUT");       
        }     
   
    }
    
}
