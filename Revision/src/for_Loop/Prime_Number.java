package for_Loop;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// Prime number = the number which has only two factors i.e number itself and 1
		// Example = 17
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int p = sc.nextInt();
		int count = 0;
		try {

			for (int i = 0; i <= p; i++) {    // Here we will get 
				if (p % i == 0) {
					count++;
				}
			}
		} catch (Exception e) {
			System.out.println("Error occured");
		}
		if (count == 2) {
			System.out.println(p + " is a Prime Number. ");
		} else {
			System.out.println(p + " is Not a Prime Number. ");
		}

	}

}
