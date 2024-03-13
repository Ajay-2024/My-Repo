package Strings;

public class strength_length {

	public static void main(String[] args) {
		String firstName = "Ravindra";
		String lastName = "Chavhan";

		String fullName = firstName + " " + lastName;

		System.out.println(fullName);

		System.out.println(fullName.length()); // Gives length including spaces.

		// Printing one by one character of fullName
		for (int i = 0; i < fullName.length(); ++i) {
			System.out.println(fullName.charAt(i));
		}

	}
}
