package Strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Mother In law";
		String str2 = "Hitler Woman";

		// Convert strings to lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		// Removing white spaces between Strings
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");

		// Check to see if the String lengths are the same
		if (str1.length() == str2.length()) {

			// convert strings into char array
			char[] str1charArray = str1.toCharArray();
			char[] str2charArray = str2.toCharArray();

			// sort the char array
			Arrays.sort(str1charArray);
			Arrays.sort(str2charArray);

			// if the sorted char arrays are same or identical then the strings are anagram
			if (Arrays.equals(str1charArray, str2charArray)) {

				System.out.println(str1 + " and " + str2 + " are Anagrams of each other.");
			} else {
				System.out.println(str1 + " and " + str2 + " are not Anagrams of each other.");
			}
		} else {
			System.out.println(str1 + " and " + str2 + " are not Anagrams of each other.");
		}
	}

}
