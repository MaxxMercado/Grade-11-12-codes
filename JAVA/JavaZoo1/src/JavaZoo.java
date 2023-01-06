/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */

public class JavaZoo {
    public String zooname = "Java Park n Zoo";
    
    public JavaZoo(){
        this.zooname = "Java Park n Zoo";      
    }
    
    public void setzooname(String zooname){
        this.zooname = zooname;
    }
    
    public String getzooname(){
        return this.zooname;
    }
    
    public static void main(String args[]){
        
        String animalname, animaltype, keepername, keepertitle;      
        
        int age =  0, L = 10, W = 10, H = 10;
        
        double payrate = 14.00;
        
        boolean hungry, clean, covered, degree;
        
        ZooAnimal myFirstAnimal = new ZooAnimal();
        Cage myFirstCage = new Cage();
        ZooKeeper myFirstZooKeeper = new ZooKeeper();
        
       //animal
        myFirstAnimal.setanimalname("Harambe");
        myFirstAnimal.setanimaltype("Gorilla");
        myFirstAnimal.setage(17);
        myFirstAnimal.sethungry(false);
        
        animalname = myFirstAnimal.getanimalname();
        animaltype = myFirstAnimal.getanimaltype();
        age = myFirstAnimal.getage();
        hungry = myFirstAnimal.gethungry();
        
       //cage
        myFirstCage.setclean(false);
        myFirstCage.setcovered(false);
        myFirstCage.setL(100);
        myFirstCage.setW(100);
        myFirstCage.setH(100  );
        
        clean = myFirstCage.getclean();
        covered = myFirstCage.getcovered();
        L = myFirstCage.getL();
        W = myFirstCage.getW();
        H = myFirstCage.getH();
        
       //Zookeeper
        myFirstZooKeeper.setkeepername("Juan");
        myFirstZooKeeper.setkeepertitle("Head Staff");
        myFirstZooKeeper.setpayrate(14.00);
        myFirstZooKeeper.setdegree(true);
        
        keepername = myFirstZooKeeper.getkeepername();
        keepertitle = myFirstZooKeeper.getkeepertitle();
        payrate = myFirstZooKeeper.getpayrate();
        degree = myFirstZooKeeper.getdegree();
        
       
        System.out.println("Java Park n Zoo");   
        System.out.println("");
        System.out.println("Animal name: " + animalname);
        System.out.println("Animal type: " + animaltype);
        System.out.println("Animal age: " + age);
        System.out.println("Hungry: " + hungry);
        System.out.println("");
        System.out.println("Cage clean: " + clean);
        System.out.println("Cage covered: " + covered);
        System.out.println("Lenght: " + L);
        System.out.println("Width: " + W);
        System.out.println("Height: " + H);
        System.out.println("");
        System.out.println("Zookeeper Name: " + keepername);
        System.out.println("Zookeeper Title: " + keepertitle);
        System.out.println("Payrate: " + payrate);
        System.out.println("Zookeepr has a degree: " + degree);
        
    }
          
}

