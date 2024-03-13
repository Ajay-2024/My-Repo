package Strings;

public class Equal_Operator {

	public static void main(String[] args) {
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = str1;

		System.out.println(str1 == str2); // false (Different address/memory locations)
		System.out.println(str1 == str3); // true (Same memory location)

	}

}
