package ThisStatement;

public class Example1 {

	int age; // This is instance or non-static global variable
	double salary; // instance or non-static global variable
	int rollNumb;
	
	Example1() {
		// non-parameterized constructor
		System.out.println("Hello");
	}
	Example1(int num) {
		this();
		age = num; // parameterized constructor
		System.out.println("Age in Years = " + age);
	}
		Example1(int n, int r) {
			this(35);
			rollNumb = r; // parameterized constructor
			System.out.println("Roll Number = " + rollNumb);
	}
	Example1(double sal) {
		this(35, 101);
		salary = sal; // parameterized constructor
		System.out.println("Salary in $ = " + salary);
	}

	public static void main(String[] args) {
		
		Example1 t1 = new Example1(789.23);	
	}
}

/* this()---> statement ---> used inside constructor body only 
 * this(): used to call another constructor of current class based on its argument.
 * this(): It should be the first statement inside the constructor body
 * We can call different constructors & non-static instance variables by creating only one object.
 */