package Assignments;

public class Reverse_number {

	public static void main(String[] args) {

		// using For Loop
		int a = 45782;
		int original = a;

		int reverse = 0;

		for (a = 45782; a != 0; a = a / 10) {
			int remainder = a % 10;
			reverse = reverse * 10 + remainder;
		}

		System.out.println("The reverse of " + original + " is " + reverse);

		// Using While Loop

		int n = 897456;
		int originalnum = n;
		reverse = 0;

		while (n != 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
		}

		System.out.println("The reverse of " + originalnum + " is " + reverse);
	}
}
