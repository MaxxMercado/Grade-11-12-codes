/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercado_activity.pkg3;

/**
 *
 * @author Ulrich
 */
import java.io.*; 
public class Mercado_activity3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    String Ename= "" ;
    String Edepartment= "" ;
    String Ecompany= "" ;
    
    System.out.print("Input Employee's name: ");
    Ename = br.readLine();
    
    System.out.print("Input Employee's Department: ");
    Edepartment = br.readLine();
    
    System.out.print("Input Emloyee's Company: ");
    Ecompany = br.readLine();
    
    
    System.out.print("Employee's Details ");
    System.out.print("\nEmployee's Name: " + Ename) ;
    System.out.print("\nEmployee's Department: " + Edepartment);
    System.out.print("\nEmployee's Ecompany : " + Ecompany);
    
    
    
   
    
    }
    
}
