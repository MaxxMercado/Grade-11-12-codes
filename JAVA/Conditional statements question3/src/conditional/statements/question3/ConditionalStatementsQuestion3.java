/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.statements.question3;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class ConditionalStatementsQuestion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        String studname, yearcode, unitsenrolled;
        double tuit, balance, rateper, dpay;
        
        System.out.println("Enter Student name: ");
        studname = br.readLine();
        
        System.out.println("Enter Year code: ");
        yearcode = br.readLine();
        
        System.out.println("Enter Number of units enrolled: ");
        unitsenrolled = br.readLine();
        
        System.out.println(" ");
                
        int ycode = Integer.parseInt(yearcode);
        int units = Integer.parseInt(unitsenrolled);
        
        if (ycode == 1 ){
           System.out.println("Students name: " + studname);
           System.out.println("Students yearname: freshman" );
            if (units > 0 && units < 10){
                dpay = 1000.00;}
            else if (units > 9 && units < 16 ){
                dpay = 1500.00;}
            else if (units > 15 && units < 22 ){
                dpay = 2000.00;}
            else dpay = 2500.00;
            
        System.out.println("Number of units enrolled: " + units);
        
        rateper = 400.00;
           
        tuit = units * rateper;
        System.out.println("Tuition fee " + tuit);
        
        System.out.println("Downpayment: " + dpay);
        
        balance = tuit -  dpay;
        System.out.println("Balance: " + balance );
     
            
        }else if (ycode == 2 ){
           System.out.println("Students name: " + studname);
           System.out.println("Students yearname: Sophomore" );
            if (units > 0 && units < 10){
                dpay = 1000.00;}
            else if (units > 9 && units < 16 ){
                dpay = 1500.00;}
            else if (units > 15 && units < 22 ){
                dpay = 2000.00;}
            else dpay = 2500.00;
            
        System.out.println("Number of units enrolled: " + units);    
            
        rateper = 350.00;
           
        tuit = units * rateper;
        System.out.println("Tuition fee " + tuit);
        
        System.out.println("Downpayment: " + dpay);
        
        balance = tuit -  dpay;
        System.out.println("Balance: " + balance );
       
        }else if (ycode == 3 ){
           System.out.println("Students name: " + studname);
           System.out.println("Students yearname: junior" );
            if (units > 0 && units < 10){
                dpay = 1000.00;}
            else if (units > 9 && units < 16 ){
                dpay = 1500.00;}
            else if (units > 15 && units < 22 ){
                dpay = 2000.00;}
            else dpay = 2500.00;
            
        System.out.println("Number of units enrolled: " + units);    
            
        rateper = 300.00;
           
        tuit = units * rateper;
        System.out.println("Tuition fee " + tuit);
        
        System.out.println("Downpayment: " + dpay);
        
        balance = tuit -  dpay;
        System.out.println("Balance: " + balance );
    
        
         }else if (ycode == 4 || ycode == 5 ){
           System.out.println("Students name: " + studname);
           System.out.println("Students yearname: Senior" );
            if (units > 0 && units < 10){
                dpay = 1000.00;}
            else if (units > 9 && units < 16 ){
                dpay = 1500.00;}
            else if (units > 15 && units < 22 ){
                dpay = 2000.00;}
            else dpay = 2500.00;
            
        System.out.println("Number of units enrolled: " + units);    
            
        rateper = 280.00;
           
        tuit = units * rateper;
        System.out.println("Tuition fee" + tuit);
        
        System.out.println("Downpayment: " + dpay);
        
        balance = tuit -  dpay;
        System.out.println("Balance: " + balance );
       
         }else {System.out.println("Invalid input");}
       
    }
    
}
