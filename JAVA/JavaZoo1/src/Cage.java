/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */
public class Cage {
    
    private boolean clean = false;
    private boolean covered = false;  
    private int L = 10, W = 10, H = 10;
    
    public Cage(){
        this.clean = false;
        this.covered = false;
        this.L = 10;
        this.W = 10;
        this.H = 10;                    
    }
    
    public void setL(Integer L){
        this.L = L;
    }
    
    public void setW(Integer W){
        this.W = W;
    }
    
    public void setH(Integer H){
        this.H = H;
    }
  
    public void setclean(boolean clean){
        this.clean = clean;
    }
    
     public void setcovered(boolean covered){
        this.covered = covered;
    }
     
    public Integer getL(){
        return this.L;
    }
    
     public Integer getW(){
        return this.W;
    }
    
     public Integer getH(){
        return this.H;
    }
    
    public boolean getclean(){
        return this.clean;
    }
    
    public boolean getcovered(){
        return this.covered;
    }
    
    
     
    
}

