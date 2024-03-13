package Arrays;

public class Largest_num {

	public static void main(String[] args) {
		// Sample array
		int[] array = { 3000, 5, 20, 1500, 25, 250, 102 };

		// Initialize the variable to store the largest element
		int largest = array[0];

		// Iterate/Traverse through the array to find the largest element
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}

		// Print the largest element
		System.out.println("Largest element of the array is: " + largest);
	}

}
