package interfaceExamples;

public class Interface3 implements Showable2 { // Inheriting Showable2 interface using implements word.

	public void print() { // Overridden print() method by providing body { }
		System.out.println("Hello");
	}

	public void show() { // Overridden show() method by providing body { }
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		
		Interface3 obj = new Interface3(); // creating object of Interface3 Class to call methods.
		obj.print();
		obj.show();
		
		Printable2 obj2 = new Interface3();  // Polymorphic reference of Parent interface Printable2 using object of Interface3 Class.
		obj2.print();
		
		// obj2.show(); We can't call show() method using polymorphic reference bcoz Parent interface Printable2 don't have Show() method
		// Even though Show() is present in Child class Interface3, we can't call it through Polymorphic reference.
		
		// Printable2 obj3 = new Printable2(); We can't create object of any interface.
		
		Showable2 obj3 = new Interface3(); // here though Showable2 is child for Printable2 but it is Parent of Child class Interface3
		obj3.show();
		obj3.print(); 
// print() is inherited by Child class Interface3 through multilevel inheritance i.e Printable2-->extends-->Showable2<--Implements<-- Interface3

	}

}

interface Printable2 {  // Parent interface Printable2
	
	void print(); // 100% abstract method by default
}

interface Showable2 extends Printable2 {   // Inheritance of interface by Child interface Showable2
	
	void show(); // 100% abstract method by default

	// public abstract void print(); ---> inherited method from Printable2 interface
}
