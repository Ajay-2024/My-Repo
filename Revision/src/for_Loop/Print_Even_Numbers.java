package for_Loop;

import java.util.Scanner;

public class Print_Even_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number limit : ");
		int n = sc.nextInt();

		System.out.println("Even numbers between 1 and " + n + " are : ");

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Odd numbers between 1 and " + n + " are : ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {   // OR if(i%2 == 1)
				System.out.println(i);
			}
		}

	}

}
