package Arrays;

import java.util.Arrays;

public class Ascending_OR_Sorting { // Using Bubble Sort

	public static void main(String[] args) {
		int[] a = { 64, 0, 34, 25, 12, 22, 55, 90 };

		System.out.print("Unsorted/Original Array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		System.out.println(" ");

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] > a[j + 1]) {
					// swap a[j] and a[i]
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		System.out.print("Sorted Array in Ascending order is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}

		System.out.println("");
		// OR using Arrays.sort()
		Arrays.sort(a);
		System.out.print("Sorted Array using sort() method is : ");
		for (int x : a) { // For each loop
			System.out.print(x + ", ");
		}
	}
}