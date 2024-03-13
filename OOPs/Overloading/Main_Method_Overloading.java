package Overloading;

public class Main_Method_Overloading {

	// Overloaded main method with no parameters
	public static void main() {
		System.out.println("No parameters");
	}

	// Overloaded main method with an array of Strings as parameter
	public static void main(String[] args) {
		System.out.println("String array as parameter");
		for (String arg : args) {
			System.out.println(arg);
		}

	}

	// Overloaded main method with a single String parameter
	public static void main(String arg) {
		System.out.println("Single String parameter: " + arg);
	}

	// Overloaded main method with two integer parameters
	public static void main(int a, int b) {
		System.out.println("Two integer parameters: " + (a + b));
	}

}
