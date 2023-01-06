/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */
public class ZooKeeper {
    
    
    private String keepername;
    private String keepertitle;
    private double payrate = 14.00;
    private boolean degree = true;
    
    public ZooKeeper(){
        this.keepername = "";
        this.keepertitle =  "";
        this.payrate = 14.00;
        this.degree =  true;     
    }
    
    public void setkeepername(String keepername){
        this.keepername = keepername;
    }
    
     public void setkeepertitle(String keepertitle){
        this.keepername = keepertitle;
    }
    
     public void setpayrate(double payrate){
        this.payrate = payrate;
    }
    
     public void setdegree(boolean degree){      
        this.degree = degree;
    }
         
    public String getkeepername(){
        return this.keepername;
    } 
    
    public String getkeepertitle(){
        return this.keepertitle;
    }
     
    public double getpayrate(){
        return this.payrate;
    }
     
    public boolean getdegree(){
        return this.degree;
    }
     
     
   
     
}
