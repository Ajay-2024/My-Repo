package Polymorphism;

public class Covariant_ReturnType {
	
	public static void main(String[] args) {
		HDFC h = new HDFC();
		System.out.println("Rate of interest for education loan is = " + h.educationLoanRoI());
	}

		public double homeLoanRoI() {
			double RoI = 7.0;
			System.out.println("Rate of interest for Home loan  = " + RoI);
			return RoI;
		}

		// public Integer educationLoanRoI() { // changing return type from earlier double to Integer Class name
		// return 5;

	// Changing Integer return type to Number
	public Number educationLoanRoI() {
		return 5;
	}
} // public class Covariant_ReturnType closed here.

class HDFC extends Covariant_ReturnType {  // Creation of Child Class
	
	@Override // We have changed the return type from Number parent class to Integer child class while Overriding educationLoanRoI() method.
	public Integer educationLoanRoI() {
		return 10;
	}
}
	
// public class always contains Main() for execution of program along with other methods.

/* Here Number is a parent class of all wrapper classes like Integer, Short, Byte, Boolean, Long, Double etc.
 * Covariant ReturnType- Return type in both parent class and child class method is class name i.e Number and Integer respectively
 * Parent Class must contain parent class return type class name and Child Class must contain child class return type class name.
 */
	


