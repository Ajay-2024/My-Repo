package Constructors;

public class Example3 {
	
	// User defined constructor with parameter and body.
	Example3(int num){
		
		age = num;
	}
	
	int age;  // This is instance or non-static global variable

	public static void main(String[] args) {
		Example3 t = new Example3(40);
		System.out.println(t.age);
		
		Example3 t2 = new Example3(50);
		System.out.println(t2.age);
	}
}
