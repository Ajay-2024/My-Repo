package Methods_creation;

public class Even_Number {

	public static void main(String[] args) {
		// Calling a method checkEven() in main method
		boolean res = checkEven(9);
		System.out.println("Is 9 even number? " + res);
	}

	// write a method to check Even number
	static boolean checkEven(int num) {
		boolean result;
		if (num % 2 == 0) 
		{
			result = true;
		} 
		else 
		{
			result = false;
		}
		return result;
	}

}
