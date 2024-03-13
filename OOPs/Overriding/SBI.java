package Overriding;

public class SBI extends RBI1 {

	public static void main(String[] args) {
		SBI s = new SBI();
		s.homeLoanRoI(); // Calling of method from Parent RBI Class through Inheritance
		
		System.out.println("RoI for education loan is " + s.educationLoanRoI());
		
		// OR we can call same method through polymorphic reference.
		
		RBI1 ref = new SBI();  // This is polymorphic reference
		System.out.println("RoI for education loan is " + ref.educationLoanRoI());

	}
	@Override // This is overridden method of RBI Class
	public double educationLoanRoI() {
		return 8.5;
	}

}

/* Here RBI has  RoI for education loan 5.5, and in order to change this as per SBI(Child Class) requirement, SBI can override parent's(RBI) method.
to fulfill SBI(child Class) need i.e RoI=8.5
This is known as Overriding. It is also known as Run-Time Polymorphism.
Which method should be executed is fixed at the time of object creation i.e at the Run time. So it is known as Run-Time Polymorphism.

Polymorphic reference- You can store the object of Child class in the parent class/interface reference variable 
Example- WebDriver driver = new ChromeDriver(); Here object of ChromeDriver class is stored in the reference variable of WebDriver Class.
*/