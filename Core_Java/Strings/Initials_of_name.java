package Strings;

public class Initials_of_name {

	public static void main(String[] args) {
		String name = "Ravindra Shivaji Chavhan";
		name = " " + name;
		int pos = name.lastIndexOf(' ');

		for (int i = 0; i < pos; i++) {
			if (name.charAt(i) == ' ') {
				System.out.print(name.charAt(i+1) + ".");
			}
		}

		System.out.print(name.substring(pos));

	}

}
