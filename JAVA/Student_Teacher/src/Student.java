/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ulrich
 */
public class Student {
    private String studentName;
    private double studentGrade;
    
    public Student(){
        this.studentName = "";
        this.studentGrade = 0;        
    }
    
    
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    
    public void setStudentGrade(double grade){
        this.studentGrade = grade;     
    }
    
    
    public String getStudentName(){
        return this.studentName;
    }
   
    public double getstudentgrade(){
        return this.studentGrade;
    }
    
    
    
    
}
