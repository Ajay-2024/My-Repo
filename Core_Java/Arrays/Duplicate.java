package Arrays;

public class Duplicate {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 4, 7, 6 };

		System.out.print("Duplicate elements in the array are : ");

		// Iterate through each element in the array using For loop
		for (int i = 0; i < array.length; i++) {

			// Check if the current element is equal to any other element in the array

			for (int j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {

					System.out.print(array[j] + ","); // If duplicate element found, print it

					break; // Once a duplicate is found, break the inner loop
				}

			}

		}

	}

}
