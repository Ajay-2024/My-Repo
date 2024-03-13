package Overloading;

public class Overload {

	public static void main(String[] args) {
		Overload o = new Overload();
		o.Multiply(2, 4);

		o.Multiply(5.5, 6.3);

		System.out.println(Overload.Multiply(2, 7, 3));
	}

	// Method 1 with 2 integer parameters
	public int Multiply(int a, int b) {
		int multiplication = a * b;
		System.out.println(multiplication);
		return multiplication;
	}

	// Method 2 With same name but with 2 double parameters
	public double Multiply(double a, double b) {
		// Returns product of double numbers
		double multiplication = a * b;
		System.out.println(multiplication);
		return multiplication;
	}

	// Multiplication of 3 numbers
	static int Multiply(int a, int b, int c) // using static variable, no need to create an object for calling method
	{
		// Return product
		return a * b * c;
	}

}

/*
when a class has same method with different type of parameter 
then that method will be known as overloaded method
 Rule:
 	type of parameter should differ OR
 	position of parameter should differ OR
 	number of parameter should differ
*/
