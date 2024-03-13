package Strings;

public class Duplicates_removal {

	public static void main(String[] args) {

		String str = "ABACABBCACCBADDAB";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			String s = "" + str.charAt(i);

			if (result.contains(s)) {
				continue;
			}
			result += s;
		}

		System.out.println("String after removal of duplicates is : " + result);

	}

}
