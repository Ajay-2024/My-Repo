package inheritance;
class RBI1 {   // Class 1- Parent Class of child BoM
	RBI1(int n){  // Parameterized constructor
		System.out.println("Welcome to RBI constructor....");
	}
	void homeLoan() {   // Method 1
		System.out.println("You will get Home Loan.");
	}
}
class BoM extends RBI1{  // Class 2- Parent Class of Child Example3
	BoM() {
		super(26); // We must write super() statement explicitly when parent class constructor is parameterized i.e RBI(int n)
		
		System.out.println("Welcome to BoM constructor....");
	}
	void personalLoan() {  // Method 2
		System.out.println("You will get Personal Loan.");
	}
}
public class Example3 extends BoM {   // Class 3- Child Class
	
	void myHome() {  // Method 3
		System.out.println("Welcome to my Home");
	}
	public static void main(String[] args) {
		BoM s1=new BoM(); // Object created for SBI class to call constructor of RBI and non-static method homeLoan
		s1.homeLoan();
		s1.personalLoan();
		
		System.out.println("..........Separates.......................");
		
		Example3 e = new Example3(); // Object created forExample3 class to call constructors of BoM and RBI and non-static method homeLoan, personalLoan
		e.homeLoan();
		e.personalLoan();
		e.myHome();
	}

}
