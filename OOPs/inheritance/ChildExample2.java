package inheritance;
class RBI{
	RBI(){
		System.out.println("Welcome to RBI constructor....");
	}
	void homeLoan() {
		System.out.println("You will get Home Loan.");
	}
}
class SBI extends RBI{
	
	SBI(){
		
		//super(); // super() statement will be written by java compiler implicitly.
		
		System.out.println("Welcome to SBI constructor....");
	}
	void personalLoan() {
		System.out.println("You will get Personal Loan.");
	}
}
public class ChildExample2{

	public static void main(String[] args) {
		SBI s1=new SBI(); // Object created for SBI class to call constructor of RBI and non-static method homeLoan
		s1.homeLoan();
		s1.personalLoan();
	}
}

