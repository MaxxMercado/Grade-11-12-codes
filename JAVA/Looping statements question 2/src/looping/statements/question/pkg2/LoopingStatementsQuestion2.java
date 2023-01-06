/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping.statements.question.pkg2;

/**
 *
 * @author Ulrich
 */
import java.io.*;
import java.util.Scanner;
public class LoopingStatementsQuestion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    
   int positive=0, negative=0, i, avg;
      int[] arr = new int[10];
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter 10 Numbers: ");
      for(i=0; i<10; i++)
         arr[i] = scan.nextInt();
      
      for(i=0; i<10; i++)
      
         if(arr[i]<0){
            negative++;
         }else if(arr[i]>0){
            positive++;
         }else
          break;
          
     
      
      avg = (positive + positive) / 10 ;
      System.out.println("Total Negative Number: " +negative);
      System.out.println("Average of all positive numbers is " +positive);
    
    
    
    }
    
}
