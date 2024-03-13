package Overriding;

public class Example4 {

	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.move();
	}
}

class Animal {
	Animal() {
		System.out.println("Animal constructor");
	}
}

class Dog2 extends Animal {

	Dog2() {

		// Here super() is used by default.
		super(); // super() is used for Calling superclass constructor i.e Animal Class
					// constructor
	}

	public void move() {

		System.out.println("Dogs can walk and run");
	}
}
