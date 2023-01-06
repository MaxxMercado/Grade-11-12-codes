/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */
public class ZooAnimal {
    
    private String animalname;
    private String animaltype;
    
    private int age = 0;
    boolean hungry = false;   
    
    public ZooAnimal(){
      this.animalname = "";
      this.animaltype = "";
      this.age = 0;
      this.hungry = false; 
    }
    
    public void setanimalname(String animalname){
        this.animalname = animalname;
    }
    
    public void setanimaltype(String animaltype) {
        this.animaltype = animaltype;         
    }
    
    public void setage(Integer age){
        this.age = age;            
    }
    
    public void sethungry(boolean hungry){
        this.hungry = hungry;            
    }
    
    public String getanimalname(){
        return this.animalname;
    }
    
    public String getanimaltype(){
        return this.animaltype;
    }
    
    
    public Integer getage(){
        return this.age;
    }
   
    public boolean gethungry(){
        return this.hungry;
    }
  
    
    
}

    
    
