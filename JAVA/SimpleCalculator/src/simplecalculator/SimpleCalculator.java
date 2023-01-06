/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecalculator;

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class SimpleCalculator  {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        String num1, num2;
        double sum = 0, diff = 0, prod = 0, quo = 0;
        
        System.out.println("Please enter the first number: ");
        num1 = br.readLine();
        
        System.out.println("Please enter the second number: ");
        num2 = br.readLine();
        
        Double n1 = new Double(num1);
        double n = n1.doubleValue();
        
        double n2 = Double.parseDouble(num2);
        
        sum = n + n2;
        diff = n - n2;
        prod = n * n2;
        quo = n / n2;
        
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + diff);
        System.out.println("The product is " + prod);
        System.out.println("The quotient is " + quo);
    }
    
}
