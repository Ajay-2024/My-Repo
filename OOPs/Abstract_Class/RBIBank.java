package Abstract_Class;

public abstract class RBIBank {

	abstract double getHomeLoan();

	final void loan() {
		System.out.println("As per RBI, Home loan rate is as follow.. ");
	}

	public static void main(String[] args) {
		PNB p1 = new PNB();
		p1.loan(); // Final method no need to override
		// Calling of overridden method getHomeLoan() by creating object of Child Class PNB
		System.out.println("PNB Rate of Interest is = " + p1.getHomeLoan() + " %");
		
		System.out.println("****************************************************");

		SBI s1 = new SBI();
		s1.loan(); // Final method no need to override
		// Calling of overridden method getHomeLoan() by creating object of Child Class SBI
		System.out.println("SBI Rate of Interest is = " + s1.getHomeLoan() + " %");
		
		System.out.println("****************************************************");

		RBIBank b1 = new SBI(); // Polymorphic reference
		System.out.println("Rate of Interest is: " + b1.getHomeLoan() + " %");
		// It will give same result as of SBI Class
		
		System.out.println("****************************************************");

		RBIBank b2 = new PNB();
		System.out.println("Rate of Interest is: " + b2.getHomeLoan() + " %");
		// It will give same result as of PNB Class

	}

}

class SBI extends RBIBank {
	double getHomeLoan() {
		return 6.45;
	}
}

class PNB extends RBIBank {
	double getHomeLoan() {
		return 7.5;
	}
}