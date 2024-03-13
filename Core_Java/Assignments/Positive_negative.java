package Assignments;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
		int i = -56;
		
		if(i>0)
		{
			System.out.println(i + " is positive number");
		}
		else
		{
			System.out.println(i + " is negative number");
		}
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the number: ");
		int p = scan.nextInt();
		System.out.println(p>0 ? p + " is positive number" : p + " is negative number");
	}

}
