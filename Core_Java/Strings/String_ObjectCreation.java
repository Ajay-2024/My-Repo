package Strings;

public class String_ObjectCreation {

	public static void main(String[] args) {

		String s = "Ravindra"; // By string literal

		String a = new String("Ajay");// By new keyword. creates two objects and one reference variable

		String s3 = "Bangalore"; // new object will be created in string constant pool
		System.out.println("Number of Characters in Ravindra are: " + s.length());
		System.out.println("Number of Characters in Ajay are: " + a.length());
		System.out.println("Number of Characters in Banglore: are " + s3.length());
	}

}

/*
 * There are two ways to create String object: 
 * 1. By string literal 
 * 2. By new keyword
 */
