package Arrays;

public class Sum {

	public static void main(String[] args) {
		int[] s = { 3, 9, 8, 7, 5, 6, 24, 56, -12, 89, -59 };
		int sum = 0;
		int sum1 = 0;
		for (int i = 0; i < s.length; i++) {
			sum += s[i]; // sum = sum + s[i];

			System.out.println("Sum using for loop = " + sum);
		}
		for (int x : s) {
			sum1 += x;
		}
		System.out.println("Sum using for each loop = " + sum1);
	}

}
/*
 * for loop and for each loop is with or without body { }
 * 
 */