package Variables;

public class variable1 {
	double n1 = 35.7;    // n1 and n2 are instance(Non-static global variables)
	double n2 = 7;
	static double result;   // result is static global variable

	public static void main(String[] args) {
		
		variable1 v = new variable1();
		System.out.println(v.n1);
		System.out.println(v.n2);
		result = v.n1 / v.n2;
		System.out.println("Division of two numbers = " + result );  //OR 
		System.out.println("Division of two numbers = " + variable1.result);
	
		// Multiplication of two numbers
		variable1 v1 = new variable1();   //object/instance creation
		v1.n1 = 67.5;
		v1.n2 = 3;
		result = v1.n1 * v1.n2;
		System.out.println("Multiplication of two numbers = " + result); // OR
		System.out.println("Multiplication of two numbers = " + variable1.result);
		
		//Swapping of values
		variable1 v2 = new variable1();
		v2.n1 = 3;
		v2.n2 = 67.5;
		result = v2.n1;
		v2.n1 = v2.n2;
		v2.n2 = result;
		System.out.println(v2.n1);
		System.out.println(v2.n2);
	}

}
