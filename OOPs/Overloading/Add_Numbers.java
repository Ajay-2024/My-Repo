package Overloading;

public class Add_Numbers {

	public static void main(String[] args) {
		Add_Numbers a = new Add_Numbers();
		a.addNumbers(23, 56.98);
		a.addNumbers(25, 75);
	}

	void addNumbers(int num1, int num2) {

		int result = num1 + num2;

		System.out.println("Sum of numbers is: " + result);
	}

	double addNumbers(int a, double b) {
		double result = a + b;
		System.out.println("Sum of numbers is: " + result);
		return result;
	}

	/*
	 * int addNumbers() { (It will give compile time error) 
	   int result=num1+num2;
	 * System.out.println("Result: "+result); return result;
	
	   void addNumbers(int c, int d) {   (It will also give compile time error) 
		int result = c + d;
		System.out.println("Result: " + result);
	}
	 */

}

/* 
1. Can we achieve method overloading by changing only return type? 
 Ans- No, not possible as for overloading parameter difference is mandatory. 
 
2. Can we achieve method overloading by changing variable names? 
 Ans- No
 
 */
