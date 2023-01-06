/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditional.statements;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class ConditionalStatements {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
       BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
       
       String midterms, finals;
       double grades; 
       
       System.out.println("Midterms ratings: ");
       midterms = br.readLine();
        
       System.out.println("Finals exam : ");
       finals = br.readLine();
       
       double midt = Double.parseDouble(midterms);
       double finalex = Double.parseDouble(finals);
        
       grades = (midt * .40) + (finalex *  .60);
    
      if (grades > 90 && grades < 101){
         System.out.println("Your grade is " + grades + " Remarks excellent");
         
    } else if  (grades > 80 && grades < 91){
         System.out.println("Your grade is " + grades + " Remarks Good");
       
    } else if  (grades > 70 && grades < 81){
         System.out.println("Your grade is " + grades + " Remarks fair");
         
    } else if  (grades > 60 && grades < 71){
         System.out.println("Your grade is " + grades + " Remarks pass");
         
    } else if  (grades < 62){
         System.out.println("Your grade is " + grades + " Remarks fail");
         
    } else 
         System.out.println("Invalid input");
      
    }
    
   /*Name = Double.parseDouble(br.readLine());
     Name = Integer.parseInt(br.readLine());

   */
 
}
