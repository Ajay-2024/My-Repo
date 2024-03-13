package Arrays;

public class SecondSmallest_Duplicate {

	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 25, 250, 102, 50, 5 };
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					// swap a[j] and a[i]
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		System.out.print("Sorted Array in Descending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		// For loop for second smallest element when duplicate are present
		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] != a[a.length - 1]) {
				System.out.println("\nSecond Smallest number is : " + a[i]);
				break;
			}
		}

	}

}
