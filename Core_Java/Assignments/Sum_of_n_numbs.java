package Assignments;

import java.util.Scanner;

public class Sum_of_n_numbs {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++ )
		{
			sum+=i;  //sum+=i means sum = sum + 1..adding one by one
		}
		
		System.out.println("Sum of first " + n + " natural numbers is " + sum);

	}

}
