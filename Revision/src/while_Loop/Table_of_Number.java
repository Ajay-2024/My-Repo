package while_Loop;

import java.util.Scanner;

public class Table_of_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		float n = sc.nextFloat();
		int i = 1;
		System.out.println("Table of " + n + " is ");
		while (i <= 10) {
			System.out.println(i + " * " + n + " = " + n*i);
			i++;
		}

	}

}
