package Methods;

public class Prime_number {

	public static void main(String[] args) {
		//Calling checkPrime() method
		int p = 11;
		boolean res = checkPrime(p);
		System.out.println(("Is the number " + p + " Prime ? " + res));
	}

	// create method to check Prime number
	static boolean checkPrime(int p) {
		boolean result;
		int count = 0;
		for(int i = 1; i<=p; i++)
			
		if(p % i == 0) 
		{
			count++;
		}
		if(count == 2) 
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
