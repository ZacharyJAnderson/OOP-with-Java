package objectorienteddesign;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Student {

    public String firstName = null;
    public String lastName = null;
    public int age = 0;
    public String id = null;
    

    //Constructor
    public Student(){
        
    }
    
    public Student(Student _Student){
        firstName = _Student.firstName;
        lastName = _Student.lastName;
        age = _Student.age;
        id = _Student.id;
        
    }
    
    public Student(String _firstName, String _lastName, int _age, String _id){
        firstName = _firstName;
        lastName = _lastName;
        age = _age;
        id = _id;
    }
    
    public void printInfo(){
        System.out.println("Student Information:");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println();
    }
}
