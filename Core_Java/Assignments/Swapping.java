package Assignments;

public class Swapping {
	
	double d;
    double e;  // Here d and e are Instance variables.
	static double temp;  // static global variable
	
	public static void main(String[] args) {
		int a = 25;
		int b = 46; // local variable
		
		int sw = a;
		a= b;
		b = sw;
		System.out.println(a);
		System.out.println(b);
		
		// In case of instance variables, we have to craete new object with same name as class name
		Swapping swap = new Swapping();
		swap.d = 100;
		swap.e = 225.50;
		temp = swap.d;
		swap.d = swap.e;
		swap.e = temp;
		System.out.println(swap.d);
		System.out.println(swap.e);
   }
}
