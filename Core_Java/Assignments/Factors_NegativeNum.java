package Assignments;

import java.util.Scanner;

public class Factors_NegativeNum {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scan.nextInt();

		for (int i = n; i <= (0 - n); i++) {
			if (i != 0 && n % i == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println("" // enter tab two separate two outputs
				+ "");

		System.out.println(".......................");

		int t = -10;

		for (int i = t; i <= (0 - t); i++) // put either i<=10 OR i<(0-t)
		{
			if (i != 0 && t % i == 0) {

				System.out.print(i + " ");
			}
		}
	}
}
