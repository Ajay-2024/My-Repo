package Arrays;

public class Copying {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		int b[] = new int[9];
		System.out.print("Original array a[] using for each loop is = ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		System.out.println("");
		// Copying of array by assigning values to each other
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.print("Copying of array a[] into b[] = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + ", ");
		}

		// Using arraycopy()
		System.arraycopy(a, 0, b, 0, a.length);
		System.out.print("\nCopying of array using arraycopy() = "); // \n to go on next line
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + ", ");
		}
	}

}
