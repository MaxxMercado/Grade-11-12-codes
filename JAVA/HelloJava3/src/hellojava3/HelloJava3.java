/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellojava3;

/**
 *
 * @author Ulrich
 */
import java.io.*; 
public class HelloJava3 {

    /**M
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
      String firstName= "" ;
      String lastName= "" ;
      
      System.out.println ("Please enter your firtname");
      firstName=br.readLine ();
      
      System.out.println ("Please enter your last name");
      lastName=br.readLine();
      
      System.out.println("hello "+firstName+" "+lastName);
      System.out.println("Welcome to Java Programming!");
      
     
      
     
      
    }
    
}
