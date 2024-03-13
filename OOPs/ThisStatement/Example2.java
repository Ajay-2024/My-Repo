package ThisStatement;

public class Example2 {
	
 String name; 
    int age; 
  
    // Constructor 1 with String as parameter. 
    public Example2(String name) 
    { 
        // This line of code calls the second constructor. 
        this(37); 
        System.out.println("Name of Student : " + name); 
    } 
  
    // Constructor 2 with int in parameter. 
    public Example2(int age) 
    { 
    	this();
        System.out.println("Age of student = " + age); 
    } 
  
    // Constructor 3 with no parameters. 
    public Example2() 
    { 
        System.out.println("Hello, welcome to my college.");
    } 
  
    public static void main(String[] args) 
    { 
        // This calls the third constructor. 
       Example2 student = new Example2("Ajay"); 
    } 
}

	

