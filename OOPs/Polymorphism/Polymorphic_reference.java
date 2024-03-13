package Polymorphism;

public class Polymorphic_reference {

	public static void main(String[] args) {

		Polymorphic_reference r = new BoM(); // This is polymorphic reference
		System.out.println(r.educationLoanRoI());  // We get overridden method value i.e 12.6
		
		System.out.println(r.getValue());
		
		// System.out.println(r.print());  // It will give an error 
	}

	public double educationLoanRoI() {
		return 5.5;
	}
	
	public int getValue() {  // Method available only in Parent Class (Polymorphic_reference).
		return 8;
	}
	/* to call this method we can also use polymorphic reference using object of child class.
	 * But we can't call a method which is available only in child class using polymorphic reference. example print() in BoM Child Class
	 */
}

class BoM extends Polymorphic_reference {
	@Override
	public double educationLoanRoI() {
		return 12.6;
	}
	
	public int print() {   // Method is only available in Child Class but not in Parent Class, will be not able to call using polymorphic reference.
		return 6;
	}
}

/* Polymorphic reference- You can store the object of Child class in the parent class/interface reference variable 
 * Example- WebDriver driver = new
 * ChromeDriver(); Here object of ChromeDriver class is stored in the reference variable of WebDriver Class.
 */
