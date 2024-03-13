package Methods_creation;

public class Positive_factors {

	public static void main(String[] args) {
		int num = 12;
		Positive_factors pf = new Positive_factors(); // Calling of non-static method by creating an object.
		pf.Positive(num);
	}

	int Positive(int num) { // non-static method

		for (int i = 1; i <= num; i++) {

			if (num % i == 0) {

				System.out.print(i + " ");
			}
		}
		return num;
	}
}
