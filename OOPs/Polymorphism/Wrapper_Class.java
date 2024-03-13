package Polymorphism;

public class Wrapper_Class {

	public static void main(String[] args) {
		
		int i = 10;  // primitive data type
		
		Integer obj = new Integer(100);  // Creating an object of Integer Class
		System.out.println(obj); //Converting primitive value of int 100 to an object of Integer Class.
		//OR
		Integer obj1 = 100;
		
		String s = new String();  // Object of String Class. If we don't give value in String constructor, nothing will be printed in console.
		System.out.println(s);  
		
		String s1 = new String("Ajay");
		System.out.println(s1);  // Now we get Ajay as output.
		

	}

}

/* int - is primitive data type while Integer is Class (Wrapper Class)  in Java

*/