package for_Loop;

import java.util.Scanner;

public class Count_num_of_Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();

		int count = 0;

		for (int i = n; i != 0; i = i / 10) {
			count++;
		}
		System.out.println("Number of digits are " + count);
	}

}
