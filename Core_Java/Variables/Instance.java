package Variables;

public class Instance {
	
	int a = 10;
	int b = 20;  // Both are instance variables - declared inside a class but outside the method

	public static void main(String[] args) {
		
		// To get the output from instance variables, we have to create an object/instance in main method
		Instance t1 = new Instance();
		Instance t2 = new Instance();
		Instance t3 = new Instance();  // Each object has its copy of instance variable
		
		System.out.println(t1.a);
		System.out.println(t2.a);
		System.out.println(t3.a);  // all gives same result as 10
		
		 // updating value of a variable in t2 object/instance. // Here we have updated value of variable a of object t2
		t2.a = 20;  
		System.out.println(t1.a); //It still give the result as 10 and not 20 because value of t2 get updated & not of t1.
		                          // Any changes to variable of any/one object does not affect other objects variable.
		// a = 30; // we can't update a=30 because JVM can confuse to which variable you want to assign/update the value 
		//Here a is local variable
		 

	}

}
