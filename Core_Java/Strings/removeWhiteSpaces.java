package Strings;

public class removeWhiteSpaces {

	public static void main(String[] args) {
		String str1 = "Ravindra Shivaji Chavhan";

		// Removes the white spaces
		str1 = str1.replaceAll("\\s", "");

		System.out.println("String after removing all the white spaces : " + str1);
	}
}
