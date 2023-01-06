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
public class Teacher {
    private String teacherName;
    
    public Teacher(){
        this.teacherName = "";     
    }
    
    public void setTeachername(String teacherName){
        this.teacherName = teacherName;
    }
   
    public String getTeacherName(){
        return this.teacherName;
    }
    
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        String s1StudentName = "";
        double s1StudentGrade = 0;
        
        Student s1 = new Student();
        Student s2 = new Student();
        
        /*
        s1.setStudentName("");
        s1.setStudentGrade(0);
        
        s1StudentName = s1.getStudentName();
        s1StudentGrade = s1.getstudentgrade();
        */      
       
        s1.setStudentName("132");
        s1.setStudentGrade(132);
        
        s1StudentName = s1.getStudentName();
        s1StudentGrade = s1.getstudentgrade();
        
        System.out.println("Please enter Student name: ");
        s1StudentName = br.readLine();
        
        System.out.println("Please enter Student grade: ");
        s1StudentGrade = Double.parseDouble(br.readLine());
        
        System.out.println("Student #1's Name: " + s1StudentName);
        System.out.println("Student #1's Grade: " + s1StudentGrade);
        
    }
}
