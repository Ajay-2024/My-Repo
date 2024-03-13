package Assignments;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		
		int y = 2025;
		
		if((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
			System.out.println(y + " is a Leap Year");
		}
		else
		{
			System.out.println(y + " is an Ordinary Year");
		}
		
		// Using Scanner class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Year: ");
		int year = scan.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println(year + " is a Leap Year");
		}
		else
		{
			System.out.println(year + " is an Ordinary Year");
		}
	}

}
