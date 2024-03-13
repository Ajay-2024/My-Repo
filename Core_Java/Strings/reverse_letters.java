package Strings;

public class reverse_letters {

	public static void main(String[] args) {
		String s = "Ravindra Shivaji Chavhan";

		for (int i = 0; i < s.length(); ++i) {
			System.out.print(s.charAt(i));
		}

		System.out.println("\n****************************");

		String name = "Ajay Singh Rathore";

		System.out.print("Reversed Name is: ");

		for (int i = name.length() - 1; i >= 0; --i) {

			System.out.print(name.charAt(i));
		}

		System.out.println("\n****************************");

		// Reverse String using for loop
		String str1 = "Indian School";
		String reversed = "";

		for (int i = str1.length() - 1; i >= 0; i--) {
			reversed += str1.charAt(i);
		}
		System.out.println("Reversed String is: " + reversed);

		System.out.println("\n****************************");

		// Java program to ReverseString using StringBuilder
		String str = "Geeks for Geeks";

		StringBuilder str2 = new StringBuilder();

		// append a string into StringBuilder str1
		str2.append(str);

		// reverse StringBuilder str1
		str2.reverse();

		// print reversed String
		System.out.println("Reverse String is: " + str2);
	}
}

/*
 * Objects of String are immutable. String class in Java does not have reverse()
 * method, however, the StringBuilder class has built-in reverse() method.
 * 
 * 
 * 
 */
