package Constructors;

public class Example4 {
	
	int age;  // This is instance or non-static global variable
	
	// constructor overloading
	Example4(){
	}
	Example4(int num){
		
		age = num;
	}
	public static void main(String[] args) {
		Example4 t = new Example4();
		System.out.println(t.age);
		
		Example4 t2 = new Example4(60);
		System.out.println(t2.age);
	}
}
