package accessModifiers;

public class Default {

	public static void main(String[] args) {

		AccessDefaultMembers d1 = new AccessDefaultMembers();
		System.out.println("Accessing Default members from child class");
		System.out.println(d1.accNum);
		d1.displayAccNum();
	}
}

class AccessDefaultMembers {
	int accNum = 12345; // Default instance variable

	void displayAccNum() { // Default method

		System.out.println("Account Number: " + accNum);
	}

}

/*
 * Default members are accessible outside the class but within the same package.
 * 
 */