package thisKeyword;

public class Example1 {
	int age = 35; // Instance/ non-static global variable

	void display() {  // non-static method
		
		System.out.println("Age from display() " + age);
	}

	void calling(int age) {  // non-static method
		System.out.println("Age from calling() = " + age);
		
		Example1 e2 = new Example1();
		System.out.println("Age global variable is, using object ref = " + e2.age);
		
		// OR
		
		System.out.println(this.age);
		
		// To call the calling() method
		calling(); 
		// OR can be called by using this.keyword
		this.calling();
	}
	
	void calling() {
		System.out.println(".......Hello World.............");
		
	}

	public static void main(String[] args) {
		Example1 e1 = new Example1();  // object created to call non-static methods
		e1.calling(25);
		e1.display();
		
	// this.display(); Cannot use this in a static context
	}

}

/*
 * this keyword: It is an instance of current class. It is used to differentiate local and non-static global(Instance) variable when they have same name.
 * It should be used only inside non-static method / constructor.
 * Using this. keyword, we don't need to create an object to access instance variables.
 * You can call non-static method.
 * You can call a constructor inside the other constructor
 * You can not call any method inside static method using this keyword.
 * You can not use this keyword inside the main method because it is also static method.
 */  