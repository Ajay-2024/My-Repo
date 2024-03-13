package Strings;

public class String_immutable {
	public static void main(String[] args) {
		String s1 = "Ajay";
		String s2 = "Ajay";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1 = "Ajay Singh";
		System.out.println(s1);
		System.out.println(s1.hashCode());
	}
}
