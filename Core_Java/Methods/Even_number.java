package Methods;

public class Even_number {

	public static void main(String[] args) {

		boolean res = checkEven(9);
		System.out.println("Is 9 even number? " + res);
	}

	// write a method to check even number
	static boolean checkEven(int num) 
	{
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
