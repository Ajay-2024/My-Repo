package Constructors;

public class Example6 {
	static int age = 34; // Static global variable
	
	public static void main(String[] args) {
		
		int age = 45; // Local variable
		System.out.println(age);
		
		System.out.println(age);  // It will also give same output because JVM go for local variable instead of global variable.
		// In order to access value of static global variable, we must use Class name.
		
		System.out.println(Example6.age);
	}

}
