package Constructors;

public class Constructor_Calling {

	Constructor_Calling() { // default constructor

		System.out.println("Hello");
	}

	Constructor_Calling(String name, int RollNum) { // parameterized constructor
		this();
		System.out.println("Hello World");
	}

	Constructor_Calling(String name) {
		this("Ajay", 35);
		System.out.println("Hello Earth");
	}

	public static void main(String[] args) {
		Constructor_Calling c = new Constructor_Calling("Rahul"); // initializing 1 parameterized constructor

	}

}
