package Arrays;

public class Descending {

	public static void main(String[] args) {
		int[] a = { 64, 0, 34, 25, 12, 22, 55, 90, 2, -24, 78, 120 };

		System.out.print("Original Array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		System.out.println(" ");

		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if (a[j] < a[j+1]) {
					// swap a[j] and a[i]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
// printing array in descending order
		System.out.print("Array in Descending order is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}

	}

}
