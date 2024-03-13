package Assignments;

public class PrimeNum {

	public static void main(String[] args) {
		int num = 31;
		int count = 0;
		
		for(int i = 1; i<=num; i++) // Put i<=num and not i<num
		{
			if(num % i == 0)  // % means remainder
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println("The number " + num + " is a prime number");
		}
		else
		{
			System.out.println("The number " + num + " is not a prime number");
		}

	}

}
