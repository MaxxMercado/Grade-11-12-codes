/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */
import java.io.*;
public class Trainer {
    
    private String trainername = "";
    private int age = 0;
    private String gender = "";
    
    public Trainer(String trainername, int age, String gender){
        this.trainername = "";
        this.age = 0;
        this.gender ="";            
    } 
    
    public void settrainername(String trainername){
        this.trainername = trainername;
    }
    
    public void setage (Integer age){
        this.age = age;       
    }
    
    public void setgender (String gender){
        this.gender = gender;       
    }
    
    public String gettrainername(){
        return this.trainername;       
    }
    
    public Integer getage(){
        return this.age;   
    }
    
    public String getgender(){
        return this.gender;
    }

    public static void main(String args[])throws Exception{
     BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
     
       String pokemonname = null, type = null, trainername, gender, answer;
       
       double hp = 0, attack = 0, defense = 0;
       
       int age, option;
       
     System.out.print("Enter trainer's name: ");
     trainername = br.readLine();
     
     System.out.print("Enter trainer's age: ");
     age = Integer.parseInt(br.readLine());
    
     System.out.print("Enter trainer's gender: ");
     gender = br.readLine();  
           
     do{
      System.out.println("\n[1] Trainer profile ");
      System.out.println("[2] Create your pokemon ");
      System.out.println("[3] View your pokemon ");
      System.out.println("[4] Edit your pokemon ");
      System.out.println("[5] exit ");
      
      System.out.print("\nEnter a number: ");
      option = Integer.parseInt(br.readLine());
      
      switch(option){
         case 1:
             System.out.println("\nTrainer's name "+ trainername);
             System.out.println("Trainer's age "+ age);
             System.out.println("Trainer's gender "+ gender);
              
             System.out.println("\nDo you want to edit your information? (yes/no)");
             answer = br.readLine();
              
             if(answer.equals("yes")) {                
                 System.out.print("\nEnter new trainer's name: ");
                 trainername = br.readLine();
     
                 System.out.print("Enter new trainer's age: ");
                 age = Integer.parseInt(br.readLine());
    
                 System.out.print("Enter new trainer's gender: ");
                 gender = br.readLine();  
                  
                 System.out.println("\nTrainer information successfully changed ");
                 break;
              }break;
         case 2:    
             if (pokemonname != null){
                 System.out.println("\nYou already have an existing pokemon. Delete and create a new one? (yes/no)");
                 answer = br.readLine();
                 if(answer.equals("yes")) { 
                     System.out.print("\nEnter new pokemon name: ");
                     pokemonname = br.readLine();
             
                     System.out.print("Enter new pokemon type: ");
                     type = br.readLine();
             
                     System.out.print("Enter new pokemon HP: ");
                     hp = Double.parseDouble(br.readLine());
             
                     System.out.print("Enter new pokemon attack: ");
                     attack = Double.parseDouble(br.readLine());
                  
                     System.out.print("Enter new pokemon defense: ");
                     defense = Double.parseDouble(br.readLine()); 
                     break;
                 }break;
                 
             }
             System.out.print("\nEnter pokemon name: ");
             pokemonname = br.readLine();
             
             System.out.print("Enter pokemon type: ");
             type = br.readLine();
             
             System.out.print("Enter pokemon HP: ");
             hp = Double.parseDouble(br.readLine());
             
             System.out.print("Enter pokemon attack: ");
             attack = Double.parseDouble(br.readLine());
                  
             System.out.print("Enter pokemon defense: ");
             defense = Double.parseDouble(br.readLine()); 
             break;
             
         case 3:  
             if (pokemonname == null){
                 System.out.println("\nCreate a pokemon first");
                 break;
             }
             System.out.print("\nPokemon name: " + pokemonname);
             System.out.print("\nPokemon type: " + type);
             System.out.print("\nPokemon HP: " + hp);
             System.out.print("\nPokemon attack: " + attack);
             System.out.println("\nPokemon defense: " + defense);
             break;
         case 4:    
             if (pokemonname == null){
                 System.out.println("\nCreate a pokemon first");
                 break;
             }
             System.out.print("\nCurrent pokemon details: ");
             System.out.print("\nPokemon name: " + pokemonname);
             System.out.print("\nPokemon type: " + type);
             System.out.print("\nPokemon HP: " + hp);
             System.out.print("\nPokemon attack: " + attack);
             System.out.print("\nPokemon defense: " + defense);
             
             System.out.print("\nEdit pokemon details? (yes/no)");
             answer = br.readLine();            
             if(answer.equals("yes")){                                 
                 System.out.print("Enter new pokemon name: ");
                 pokemonname = br.readLine();
             
                 System.out.print("Enter new pokemon type: ");
                 type = br.readLine();
             
                 System.out.print("Enter new pokemon HP: ");
                 hp = Double.parseDouble(br.readLine());
             
                 System.out.print("Enter new pokemon attack: ");
                 attack = Double.parseDouble(br.readLine());
                  
                 System.out.print("Enter new pokemon defense: ");
                 defense = Double.parseDouble(br.readLine()); 
                 
                 System.out.println("\nPokemon details successfully changed ");
                 break;                
             }
         case 5: System.exit(0);    
             
      }
      
      }while(option == 1 || option == 2 || option == 3 || option == 4 || option == 5);
               
      
    }
}





