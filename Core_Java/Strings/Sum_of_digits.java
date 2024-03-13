package Strings;

public class Sum_of_digits {

	public static void main(String[] args) {
		String str = "a2b3c4d5Ajay@2023";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				sum += Integer.parseInt("" + ch);
			}
		}
		System.out.println(sum);

	}
}
