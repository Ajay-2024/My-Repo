package thisKeyword;

public class Student {
	
	String name; 
    int age; 
  
    // Note that in the Constructor below "this keyword" is  used to differentiate between the local variable and  the instance variable. 
  
    public Student(String name, int age) // Here local & global(instance) variable have same name.
    { 
        // Assigns the value of local variable name to global(instance) variable name. 
        this.name = name; 
        
     // Assigns the value of local variable age to global(instance) variable age. 
        this.age = age; 
    } 
  
    public void show() // method
    { 
        System.out.println("I am " + this.name); 
        
        System.out.println("My age is " + this.age); 
    } 
  
    public static void main(String[] args) 
    { 
        // Creating new instance of Student Class 
        Student student = new Student("Ajay", 29); 
        
        student.show(); 
    } 
}

