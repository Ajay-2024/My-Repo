package while_Loop;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int pal = sc.nextInt();
		int Original = pal;
		int reverse = 0;

		while (pal != 0) {
			int rem = pal % 10;
			reverse = reverse * 10 + rem;
			pal = pal / 10;
		}
		if (reverse == Original) {
			System.out.println(Original + " is a Palindrome number ");
		} else {
			System.out.println(Original + " is not a Palindrome number ");
		}

	}

}
