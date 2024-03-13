package Abstract_Class;

public abstract class Animal {

	// Abstract method
	public abstract void animalSound();

	// Regular method
	public void sleep() {
		System.out.println("Zzz");
	}

	public static void main(String[] args) {  // Main method of Class Animal
		Pig myPig = new Pig(); // Creating an object Child Class Pig
		myPig.animalSound(); // Calling of overridden animalSound() of Child class Pig
		myPig.sleep();   // Calling of normal method sleep() of Parent abstract class Animal.
		
		Dog d1=new Dog();  // Creating an object of Child Class Dog
		d1.animalSound();
		d1.sleep();
	}
}

//Sub/Child class (inherited from Animal)
class Pig extends Animal {
	
	// Overridden method. // The body of animalSound() is provided here
	public void animalSound() {
		
		System.out.println("The pig says: wee wee");
	}
}

//Sub/Child class (inherited from Animal)
class Dog extends Animal {
	
	// Overridden method. // The body of animalSound() is provided here
	public void animalSound() {
	
		System.out.println("The dog says: bow bow");
	}
}
