package Arrays;

public class SecondLargest {
	// When we have duplicate elements
	public static void main(String[] args) {
		int[] a = { 10, 250, 20, 150, 25, 102, 150 };
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					// swap a[j] and a[i]
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		System.out.print("Sorted Array in Ascending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		// For loop for second largest element
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] != a[a.length - 1]) {
				System.out.println("\nSecond Largest number is : " + a[i]);
				break;
			}
		}
		// For loop for Third largest element
		for (int i = a.length - 4; i >= 0; i--) {
			if (a[i] != a[a.length - 3]) {
				System.out.println("Third Largest number is : " + a[i]);
				break;

			}
		}
	}
}
