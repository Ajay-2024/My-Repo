package Methods_creation;

public class Method_creation {

	public static void main(String[] args) {
		int num = 7;
		System.out.println(checkPrimeNumber(num));

	}

	static boolean checkPrimeNumber(int num) {
		if (num % 1 == 0) {
			System.out.print(" Is number " + num + " prime? " );
			return true;
		} else {
			System.out.print(" Is number " + num + " prime? " );
			return false;
		}
	}
}
