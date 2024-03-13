package Strings;

public class Reverse {

	public static void main(String[] args) {
		String str1 = "Dhanori Pune";

		// to print one by one character of string
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(" " + str1.charAt(i));
		}
		System.out.println("\n*************************");

		// to print one by one character of string from the last index/ Reversing
		for (int i = str1.length() - 1; i >= 0; i--) {
			System.out.print(" " + str1.charAt(i));
		}

		System.out.println("\n*************************");

		String Original = "Hello, world!";
		String reversed = reverse(Original);
		System.out.println("Original string: " + Original);
		System.out.println("Reversed string: " + reversed);
	}

	private static String reverse(String str) {
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp = temp + str.charAt(i);
		}
		return temp;
	}
}
