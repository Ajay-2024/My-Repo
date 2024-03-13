package Arrays;

public class Ascending {

	public static void main(String[] args) {
		int[] a = { 64, 0, 34, 25, 12, 22, 55, 90, 2, -24, 78, -88 };

		System.out.print("Original Array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		System.out.println(" ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					// swap a[j] and a[i]
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
// printing array in ascending order
		System.out.print("Array in Ascending order is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}


	}

}
