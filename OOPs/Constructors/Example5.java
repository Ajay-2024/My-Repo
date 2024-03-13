package Constructors;

public class Example5 {

	int age; // This is instance or non-static global variable
	
	double salary;   // instance or non-static global variable
	
	int rollNum;

	Example5() {
	                // non-parameterized constructor
	}
	
	Example5(int num) {
		age = num;         // parameterized constructor
	}
	
	Example5(double sal) {
		salary = sal;      // parameterized constructor
	}
	
	Example5(int a, double s) {
		age = a;
		salary = s;        // parameterized constructor

	}
	
	Example5(int  n, int s, int r) {
		age = n;
		salary = s;        // parameterized constructor
		rollNum = r;
	}
	
	public static void main(String[] args) {
		Example5 t = new Example5();
		System.out.println(t.age);

		Example5 t2 = new Example5(60);
		System.out.println(t2.age);
		
		Example5 t3 = new Example5(62578.87);
		System.out.println(t3.salary);
		
		Example5 t4 = new Example5(76, 9876.5532);
		System.out.println(t4.age);
		System.out.println(t4.salary);
		
		Example5 t5 = new Example5(35, 127, 101);
		System.out.println(t5.age);
		System.out.println(t5.salary);
		System.out.println(t5.rollNum);
	}
}
