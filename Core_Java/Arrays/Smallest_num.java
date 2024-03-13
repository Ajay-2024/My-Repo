package Arrays;

public class Smallest_num {

	public static void main(String[] args) {
		// Sample array
		int[] array = { 10, 5, 20, 1500, 25, 250, 102, 2 };

		// Initialize the variable to store the smallest element
		int smallest = array[0];

		// Iterate through the array to find the largest element
		for (int i = 1; i < array.length; i++) {
			if (smallest > array[i] ) {
				
				smallest = array[i];
			}
		}
		// Print the smallest element
		System.out.println("Smallest element of the array is " + smallest);

	}

}
