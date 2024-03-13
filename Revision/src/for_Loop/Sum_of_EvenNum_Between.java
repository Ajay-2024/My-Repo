package for_Loop;

import java.util.Scanner;

public class Sum_of_EvenNum_Between {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number : ");
		int s = sc.nextInt();
		System.out.println("Enter the last number : ");
		int n = sc.nextInt();
		int sum = 0;

		for (int i = s; i <= n; i++) {  // Sum is Including both start and last values

			if (i % 2 == 0) {

				sum = sum + i;
			}
		}
		System.out.println("Sum of Even Numbers between " + s + " and " + n + " including both values is = " + sum);
	}

}
