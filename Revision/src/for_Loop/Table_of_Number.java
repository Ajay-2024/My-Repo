package for_Loop;

import java.util.Scanner;

public class Table_of_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		System.out.println("Table of " + n + " is ");

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
		}

	}

}
