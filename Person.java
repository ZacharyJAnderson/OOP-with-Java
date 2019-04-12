package objectorienteddesign;

/*
 * Class: Person
 * 
 * Documentation: USING DATA ENCAPSULATION AND HIDDING
                  APPLYING DATA VALIDATION
 */

/**
 *
 * @author Zachary J. Anderson 4/9/2019
 */
public class Person {

    private String firstName = null;
    private String lastName = null;
    private int age = 0;
    private String id = null;
    private String mobilePhone = null; // xxxxxxxxxx
    
    private static int counter = 0;
    
    public static int getCounter(){
        return counter;
    }
    
//  Default Constructor
    public Person(){
        Person.counter++;
    }
    
//  Copy Constructor  
    public Person(Person P){
        this.setFirstName(P.firstName);
        this.setLastName(P.lastName);
        this.setAge(P.age);
        this.setId(P.id);
        this.setMobilePhone(P.mobilePhone);
        Person.counter++;   
    }
    
//  full-argument constructor    
    public Person(String firstName, String lastName, int age, String id,
            String mobilePhone){
        
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setId(id);
        this.setMobilePhone(mobilePhone);
        Person.counter++;
    }
    
//  Attribute Setters and Getters OR "Mutator Methods"
//  ---> Allows for data validation
    
    public String getFirstName(){
        return firstName;
    }
    
    public final void setFirstName(String _firstName){
        this.firstName = _firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public final void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public int getAge(){
        return age;
    }
    
    public final void setAge(int age){
        
        if(age > 0){
            this.age = age;
        }
//        Throw Exception
        else{
            throw new IllegalArgumentException("Age must be greater than ZERO");
        }
        
    }

    public String getId(){
        return id;
    }
    
    public final void setId(String id){
        this.id = id;
    }
    
    public String getMobilePhone(){
        return this.mobilePhone;
    }
    
    public final void setMobilePhone(String mobilePhone){
        if( mobilePhone.startsWith("605") && mobilePhone.length() == 10 ){
            this.mobilePhone = mobilePhone;
        }
        else{
            throw new IllegalArgumentException(
                    "Mobile phone must start with 605 and have 10 digits");
        }        
    }
    
    public void printInfo(){
        System.out.println("Student Information:");
        System.out.println("First Name: " + getFirstName() );
        System.out.println("Last Name: " + getLastName() );
        System.out.println("Age: " + getAge() );
        System.out.println("ID: " + getId() );
        System.out.println("Mobile Phone: " + getMobilePhone() );
        System.out.println();
    }
    
   @Override 
   public String toString(){
       return String.format("%s %s", getFirstName(), getLastName());
   }
}
