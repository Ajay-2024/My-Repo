package Strings;

public class Equal_Operator_equals_method {

	public static void main(String[] args) {
		String s1 = "Ravindra"; 
		String s2 = "ravindra"; 
		String s3 = "Ajay";
		String s4 = new String("Ajay");
		String s5 = new String("Ravindra");
		
		System.out.println("comparing s1 & s2 using equals(): " + s1.equals(s2));//comparing s1 and s2 values
		System.out.println("comparing s1 & s2 using '=='operator: " + (s1==s2));//compare s1 & s2 based on address
		
		System.out.println("s1 & s3 using equals(): "+s1.equals(s3));//compare s1 and s3 values
		System.out.println("s1 & s3 using '==': "+(s1==s3));//compare s1 & s3 based on address
		
		System.out.println("comparing  s3 & s4 using equals(): "+s3.equals(s4));
		System.out.println("comparing  s3 & s4 using '==': "+(s3==s4));
		
		System.out.println("comparing  s1 & s5 using equals(): "+s1.equals(s5));
		System.out.println("comparing  s1 & s5 using '==': "+(s1==s5));
		
		System.out.println("comparing  s2 & s5 using equals(): "+s2.equals(s5));
		System.out.println("comparing  s2 & s5 using '==': "+(s2==s5));



	}

}

/*
 * Outside String class:
 * 		 == --> compare two values
 * 		.equals(obj) --> compare two objects based on their address
 * Inside String class:
 * 		 == --> compare two objects based on address/memory location
 * 		.equals(obj) --> compare two objects based on value
 */