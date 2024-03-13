package for_Loop;

import java.util.Scanner;

public class Sum_of_Odd_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number limit : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 1) {

				sum = sum + i;
			}
		}
		System.out.println("Sum of Odd numbers between 1 and " + n + " is : " + sum);

	}

}
