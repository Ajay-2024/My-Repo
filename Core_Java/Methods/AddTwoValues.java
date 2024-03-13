package Methods;

public class AddTwoValues {

	public static void main(String[] args) {

		// Calling addTwoNumber method in main method
		addTwoNumber();
		System.out.println("*****************************");
	}
	// create a method to add two numbers
	static void addTwoNumber() {
		int num1 = 10, num2 = 20, result;
		result = num1 + num2;
		System.out.println("Number1: " + num1);
		System.out.println("Number2: " + num2);
		System.out.println("Result: " + result);
		
		System.out.println(".............................."); 
		
		int res = subtractTwoNumbers(10, 20);
		System.out.println("Subtraction of numbers = " + res);
		
		//subtractOfTwoNumbers(88, 42);
	}
	// Create a method with return type to subtract values 
	static int subtractTwoNumbers(int num1, int num2) {
		
		int result=num1-num2;
		
		return result;
	}
	

	}

