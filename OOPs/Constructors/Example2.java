package Constructors;

public class Example2 {

	int age = 35; // This is instance or non-static global variable

	// User defined constructor. Constructor is used to load non-static members into the memory.

	Example2() {

	 this.age = age;
	}

	public static void main(String[] args) {

		Example2 t = new Example2();

		System.out.println(t.age);
	}
}
