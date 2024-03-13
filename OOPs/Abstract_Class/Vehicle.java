package Abstract_Class;

public abstract class Vehicle {
	
	abstract void run();  // Abstract method with no method body { }
	
	void speed(int spd) {  // Normal/Concrete method
		
		System.out.println("Vehicle speed: "+spd);
	}

	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.run();  // Overridden abstract method run()
		obj.speed(60);
		obj.color();
		
		System.out.println("*****************************");
		
		Vehicle v=new Honda();	// Polymorphic reference
		v.run();       // Overridden abstract method run()
		v.speed(20);
		
		// v.color();  // It will give an error because color() is only present in Child Class Honda & not in Parent class Vehicle
		// In this case, we cant call a method color() using Polymorphic reference.
	}
}

// Child Class Honda
class Honda extends Vehicle {  // Inheritance
	// Method run() overridden by giving body { }
	void run() {
		System.out.println("running safely");
	}
	void speed(int spd) {
		System.out.println("Honda speed: "+spd);
		super.speed(120);  // Calling speed() of Parent class Vehicle due to super keyword.
	}
	void color() {
		System.out.println("Honda color is blue");
	}
}
