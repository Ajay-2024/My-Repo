package Assignments;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		
		System.out.print("Factors of " + n + " using for Loop are : ");
		
		for (int i = 1; i <= n; i++) // for(initialization; condition; updation(increment/decrement))
		{
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n****************************************************");
		
		System.out.print("Factors of " + n + " using while Loop are : ");
		// using While Loop
		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
	}
}
