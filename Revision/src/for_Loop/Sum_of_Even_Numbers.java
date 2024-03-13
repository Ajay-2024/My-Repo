package for_Loop;

import java.util.Scanner;

public class Sum_of_Even_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number limit : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {

				sum = sum + i;
			}
		}
		System.out.println("Sum of Even numbers between 1 and " + n + " is : " + sum);
	}

}
