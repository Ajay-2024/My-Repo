package thisKeyword;

public class Test {

	public static void main(String[] args) {
		Test t = new Test();
		t.dance();  // Calling non-static method by object creation
	}
	
	public void dance() {   // non-static method
		System.out.println("Let us dance in the party.");
		// calling of sing() and rest() using this.keyword
		this.sing();
		this.rest();
		this.talk(); // Though we can access static method using this. keyword there is standard way for calling a static method.
		//The static method talk() from the type Test should be accessed in a static way by using Class name.
		Test.talk();
	}
	
	public void sing() {  // non-static method
		System.out.println("Ajay is singing a song.");
	}
	
	public void rest() {  // non-static method
		System.out.println("You can take a rest.");
	}
	
	public static void talk() {
		System.out.println("Don't talk");
	}

}

// this. keyword can be use anywhere in a Class except in static methods.
// Whenever any object is created, this. keyword get activated.