package inheritance;

class ParentExample1 {

	/* default constructor ParentExample1(){ }
	 */

	int age = 25;
	static double salary = 25000.56;
}

public class ChildExample1 extends ParentExample1 {
	
	/* default constructor ChildExample1(){ 
	 * super(); // it can be written by JVM compiler implicitly
	 * }
	 */

	int empId = 1001;
	static int pinCode = 411014;

	public static void main(String[] args) {

		ChildExample1 c1 = new ChildExample1(); // Object created to call instance variables age and emId by inheritance
		System.out.println("Calling age from ParentExample1 class: " + c1.age);
		System.out.println("Calling empID from ChildExample1 class: " + c1.empId);
		
		System.out.println("...............................");

		System.out.println("Calling salary from ParentExample1 class: " + ParentExample1.salary);
		System.out.println("Calling pinCode from ChildExample1 class: " + ChildExample1.pinCode);
		
	   // Here salary and pinCode are static variables so they dont participate in inheritance. Static members never perform inheritance
	}
}

/*
 * Inheritance: when a class acquire property of another class known as
 * inheritance
 * 
 * Parent/Super/Derived class: class from where members are getting inherited
 * Child/Sub-class/Inherited class: class to whom members are getting inherited
 * 
 * Represent: class childClassName extends parentClassName{
 * 
 * }
 * 
 * how: to achieve this we use constructor chaining, when child class constructor calls parent class constructor and parent class constructor calls
 * its parent class constructor known constructor chaining.
 * to do this we use super() statement, this will help us to call parent class constructor based on the parameter. 
 * super() should be the 1st statement inside constructor body
 * NOTE: this() and super() can't be used together. 
 * static member never participate in inheritance.
 */

