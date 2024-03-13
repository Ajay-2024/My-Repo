package Overloading;

public class Var_args_Method {

	public static void main(String[] args) {
		// Calling of method add() through object creation of Class
		Var_args_Method v = new Var_args_Method();
		System.out.println(v.add(3, 4, 6, 8, 9));
		System.out.println(v.add(23.4, 45.6, 67.8, 89.56));
	}

	// Method with var-args
	public int add(int... numbers) {
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	}

	// Method overloading with var-args
	public double add(double... numbers) {
		double sum = 0;
		for (double num : numbers) {
			sum += num;
		}
		return sum;
	}
}
