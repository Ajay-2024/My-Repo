package while_Loop;

import java.util.Scanner;

public class Count_num_of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		long n = sc.nextLong();
		long Original = n;
		int count = 0;

		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.println("Number of digits in " + Original + " are " + count);
	}

}
