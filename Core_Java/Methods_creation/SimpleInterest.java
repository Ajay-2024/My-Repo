package Methods_creation;

public class SimpleInterest {

	static double SI(double p, double r, double t) {
		double si = (p*r*t)/100;
		return si;
	}
	
	public static void main(String[] args) {
		
		double result = SI(55000, 5, 8.5);
		
		System.out.println("Simple Interest @ 5 for 8.5 years is " + result);
		

	}

}
