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
public class StudentTest {
    public static void main(String []args){
        
        Student Student_1 = new Student();
        
        Student_1.firstName = "Zach'";
        Student_1.lastName = "Anderson";
        Student_1.age = 27;
        Student_1.id = "123ABC";
        
        Student Student_2 = new Student();
        
        Student_2.firstName = "Marissa'";
        Student_2.lastName = "Shultheis";
        Student_2.age = 27;
        Student_2.id = "ABC123";
        
        Student_1.printInfo();
        Student_2.printInfo();
        
        Student Student_3 = new Student("John", "Doe", 23, "5678");
        
        Student_3.printInfo();
        
        Student Student_4 = new Student(Student_1);
        
        Student_4.printInfo();
    }   
}