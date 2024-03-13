package Methods_creation;

public class Prime_Number {
	
	public static void main(String[] args) {
		// Calling checkPrime() method
		int p = 11;
		boolean res = checkPrime(p);
		System.out.println(("Is the number " + p + " Prime? " + res));
		            // OR
		System.out.println(Prime_Number.checkPrime(11));
	}

	// create method to check Prime number
	static boolean checkPrime(int p) {
		boolean result;
		int count = 0;
		for (int i = 1; i <= p; i++) // For loop
			if (p % i == 0) {
				count++;
			}
		if (count == 2) // Condition
		{
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
