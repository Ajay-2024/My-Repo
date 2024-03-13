package Arrays;

public class Odd_position {

	public static void main(String[] args) {
		// Java program to print elements of an array present at odd position
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Sample array

		System.out.print("Elements at even positions: ");
		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(arr[i] + " ");
		}

	}

}
