package Assignments;

import java.util.Scanner;

public class Prime_number { // Prime Number means- number>1 and it has only 2 factors i.e 1 and that number itself
						

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		int count = 0;

		for (int i = 1; i <= n; i++) // Or put i = 2 and count == 0 it will give same result
		{
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) // count == 2 means prime number will have only 2 factors i.e 1 and that number
						// itself
		{
			System.out.println("The number " + n + " is a prime number.");
		} else {
			System.out.println("The number " + n + " is not a prime number");
		}

	}

}
