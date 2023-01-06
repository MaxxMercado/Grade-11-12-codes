/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping.statements.question1;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class LoopingStatementsQuestion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        double A = 0, B = 0, Q = 0;
        
        System.out.println("Input data A: ");
        A = Double.parseDouble(br.readLine());
        
        System.out.println("Input data B: ");
        B = Double.parseDouble(br.readLine());
        
      while (B <= 0){
           System.out.println("Invalid " + B); 
           
        }
            
        while (B > 0){
           Q = (A/B);
           System.out.println("Q = "+ Q);
   
           break;        
        }
      

     }
}
 