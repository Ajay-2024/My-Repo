package Strings;

public class Palindrome {

	public static void main(String[] args) {
		String s = "Rotator";
		String reversed = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			reversed += s.charAt(i);
		}

		if(s.equalsIgnoreCase(reversed)) {
			System.out.println("The name " + s + " is Palindrome");
		} else {
			System.out.println("The name " + s + " is not Palindrome");
		}

	}

}
