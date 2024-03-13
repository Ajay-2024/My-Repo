package Overriding;

public class RBI {

	public static void main(String[] args) {
		RBI1 obj = new RBI1();
		System.out.println("RoI for education loan is " + obj.educationLoanRoI());

		BoM b = new BoM();
		System.out.println("RoI for education loan is " + b.educationLoanRoI());

		RBI1 ref = new BoM(); // polymorphic reference
		System.out.println(ref.homeLoanRoI());
	}
}

class RBI1 {

	public double homeLoanRoI() {
		double RoI = 7.0;
		System.out.println("Rate of interest for Home loan  = " + RoI);
		return RoI;
	}

	public double educationLoanRoI() {
		return 5.5;
	}
}

class BoM extends RBI1 {

	public double educationLoanRoI() {
		return 10.5;
	}
}

/*Polymorphic reference- You can store the object of Child class in the parent class/interface reference variable 
Example- RBI1 ref = new BoM();
 WebDriver driver = new ChromeDriver(); Here object of ChromeDriver class is stored in the reference variable of WebDriver Class.
*/
