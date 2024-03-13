package Arrays;

public class Reverse_Copying {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int b[] = new int[9];

		System.out.print("Original array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}

		System.out.println(" ");
		// Reverse copying of elements of an array
		for (int i = a.length - 1, j = 0; i >= 0; i--, j++) {
			b[j] = a[i];
		}
		System.out.print("Reversed array is: ");
		for (int x : b) {
			System.out.print(x + ", ");
		}

	}

}
