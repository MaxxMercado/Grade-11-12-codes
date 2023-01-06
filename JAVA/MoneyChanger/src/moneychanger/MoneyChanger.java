/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneychanger;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class MoneyChanger   {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    
    String amount1;
    int P1000, P500, P200, P100, P50, P20, P10, P5, P1; 
    
    System.out.println("Please enter amount: ");
    amount1 = br.readLine();
   
    int amount = Integer.parseInt(amount1);
    
    P1000 = amount/1000;
    amount = amount%1000;
    
    P500 = amount/500;
    amount = amount%500;
    
    P200 = amount/200;
    amount = amount%500;
    
    P100 = amount/100;
    amount = amount%100;
    
    P50 = amount/50;
    amount = amount%50;
    
    P20 = amount/20;
    amount = amount%20;
    
    P10 = amount/10;
    amount = amount%10;
    
    P5 = amount/5;
    amount = amount%5;
    
    P1 = amount/1;
    amount = amount%1;
    
    
    System.out.println("1000: " + P1000);
    System.out.println("500: " + P500);
    System.out.println("200: " + P200);
    System.out.println("100: " + P100);
    System.out.println("50: " + P50);
    System.out.println("20: " + P20);
    System.out.println("10: " + P10);
    System.out.println("5: " + P5);
    System.out.println("1: " + P1);        
   
    
    


    }
    
}
