package Methods;

public class SubtractTwoNumbers {

	public static void main(String[] args) {
		// //Calling a method in main method
		int res = subtractTwoNumbers(80, 20);
		System.out.println("Subtraction of 80 and 20 = " + res);
	}

	// Create a method with return type to subtract values
	static int subtractTwoNumbers(int a, int b) {

		int result = a - b;
		return result;
	}

}
