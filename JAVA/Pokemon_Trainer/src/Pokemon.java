/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */
public class Pokemon {
    
    private String pokemonname;
    private String type;
    private double hp = 0;
    private double attack = 0;
    private double defense = 0;
    
    public Pokemon (String pokemonname, String type, double hp, double attack, double defense){
        
        this.pokemonname =  "";
        this.type = "";
        this.hp = 0;
        this.attack = 0;
        this.defense = 0;      
    }
    
    public void setpokemonname(String pokemonname){
        this.pokemonname = pokemonname;      
    }
    
    public void settype (String type){
        this.type = type;       
    }       
    
    public void sethp (double hp){
        this.hp = hp; 
    }
    
    public void setattack (double attack){
        this.attack = attack; 
    }    
    
    public void setdefense(double defense){
        this.defense = defense; 
    }    
    
    public String getpokemonname(){
        return this.pokemonname;
    }
    
    public String gettype(){
        return this.type;
    }
    
    public double gethp(){
        return this.hp;
    }
    
     public double getattack(){
        return this.attack;
    }
    
     public double getdefense(){
        return this.defense;
    }
    
    
}

 