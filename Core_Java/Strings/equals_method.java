package Strings;

public class equals_method {

	public static void main(String[] args) {
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		String str3 = "Hello";

		System.out.println(str1.equals(str2)); // true (Contents are the same)
		System.out.println(str1.equals(str3));

	}

}
