package Strings;

public class Capitalize_Initials {

	public static void main(String[] args) {
		String s = "ravindra shivaji chavhan";
		s = " " + s;
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == ' ') {
				result += ch;
				i++;
				ch = s.charAt(i);
				result += Character.toUpperCase(ch);
			} else {
				result += ch;
			}
		}
		result = result.trim();
		System.out.println(result);
	}

}
