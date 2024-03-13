package Methods;

import java.util.Scanner;

public class String_Concate {

	public static void main(String[] args) {
		String_Concate s = new String_Concate();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first String: ");
		String s1 = scan.nextLine();
		
		System.out.println("Enter second String: ");
		String s2 = scan.nextLine();
		
		String result = s.concateTwoStrings(s1, s2);
		System.out.println(result);

	}
	
	public String concateTwoStrings(String s1, String s2)
	{
		String finalString = s1 + " " + s2;
		
		return finalString;
	}

}
