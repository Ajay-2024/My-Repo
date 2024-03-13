package Methods_creation;

public class Negative_factors {

	public static void main(String[] args) {

		int num = -10;
		Factors(num);
	}

	static int Factors(int num) { // static method

		for (int i = num; i <= (0 - num); i++) // put either i<=10 OR i<(0-t)
		{
			if (i != 0 && num % i == 0) {
				System.out.print(i + " ");
			}
		}
		return num;
	}

}
