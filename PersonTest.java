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
public class PersonTest {
    public static void main(String []args){
        
        Person Person_1 = new Person();
        
        Person_1.setFirstName("Zach");
        Person_1.setLastName("Anderson");
        Person_1.setAge(27);
        Person_1.setId("123ABC");
        Person_1.setMobilePhone("6056513175");
        
        Person_1.printInfo();
        
        Person Person_2 = new Person();
        
        Person_2.setFirstName("Marissa'");
        Person_2.setLastName("Shultheis");
        Person_2.setAge(27);
        Person_2.setId("ABC123");
        Person_2.setMobilePhone("6052204682");
        
        Person_2.printInfo();
        
        Person Person_3 = new Person("John", "Doe", 23, "5678", "6050000000");
       
        Person_3.printInfo();
        
        Person Person_4 = new Person(Person_1);
             
        Person_4.printInfo();
        
        System.out.println(Person_4);
    }   
}