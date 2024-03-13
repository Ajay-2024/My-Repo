package interfaceExamples;

public class Interface2 implements Printable, Showable { 
	// Multiple Inheritance- Child class Interface2 inheriting two parents Printable & Showable.
	
	public static int age=45; // Static global variable
	
	public void print() {
		System.out.println("Hello, print");
	}
	public void show() {
		System.out.println("Welcome, show");
	}

	public static void main(String[] args) {
		
		Interface2 obj = new Interface2();
		obj.print();
		obj.show();
		
		System.out.println(Printable.age);  // calling of Static global variable by interface name.variable name
		
		System.out.println(Interface2.age);  // calling of Static global variable by class name.variable name
	}
}

interface Printable {
	int age = 30;// by default public static final

	void print();
}

interface Showable {
	public void show();
}