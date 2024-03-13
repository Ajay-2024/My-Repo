package while_Loop;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int count = 0;
		int i = 1;

		while (i <= n) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println(n + " is a Prime Number. ");
		} else {
			System.out.println(n + " is NOT a Prime Number. ");
		}

	}

}
