package Strings;

public class Reverse_String {

	public static String revstr(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static void main(String[] args) {
		String str = "Ajay Singh Rathore";
		str = revstr(str);
		System.out.println("Reversed Name after reversing a string is: " + str);
		
		
		// Reverse String using StringBuffer
		String s = "Vandemataram";
		// conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer(s);
		// To reverse the string
		sbr.reverse();
		System.out.println("Reversed String is: " + sbr);

	}

}
