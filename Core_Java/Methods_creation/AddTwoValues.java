package Methods_creation;

public class AddTwoValues {

	public static void main(String[] args) {
		addTwoNumber(); // Calling of method1

		additionOfTwoNumbers(10, 20); // Calling of method2. Here (10 ,20) is actually Arguments
		// Arguments are the values which are passed/assign during the calling of a method into main method.
		
		// In case of return type, we have to call & print a method to get a result/output in the console.
		int a = 120; int b = 340;
		System.out.println(addNumbers(a, b));  
		
		         //OR
		int sum = addNumbers(a, b);
		System.out.println(sum);
	}

	// create a method 1 to add two numbers
	static void addTwoNumber() {
		int num1 = 10, num2 = 20, result;
		result = num1 + num2;
		
		System.out.println("Addition = " + result);
	}

//create a method2 to add two numbers
	static void additionOfTwoNumbers(int num1, int num2) { // Here (int num1, int num2) is parameter list
		int result = num1 + num2;
		System.out.println("Addition = " + result);
	}
		
		//create a method3 to add two numbers with return type
		static int addNumbers(int a, int b) {
			
			int result = a + b;
			
			return result;
		}
	}

