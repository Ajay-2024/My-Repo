package Strings;

public class Unique_characters {

	public static void main(String[] args) {
		String str = "Programming";
		String uniques = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				uniques += ch;
			}
		}

		System.out.println("Unique String is : " + uniques);
	}
}

// unique means removing all double characters