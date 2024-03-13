package Arrays;

import java.util.*;

public class DuplicateElement_Count {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 2, 4, 7, 6, 7, 6, 8 };

		// Sorting of an Array
		System.out.println("Sorted Array");
		Arrays.sort(array);

		System.out.print("Duplicate elements are repeated along with frequency : ");
		int j, count;

		// Iterate through each element in the array using For loop
		for (int i = 0; i < array.length; i++) {
			count = 1;
			// Check if the current element is equal to any other element in the array
			for (j = i + 1; j < array.length; j++) {

				if (array[i] == array[j]) {
					count++;
				} 
				else {
					break;
				}
			}
			i = j-1;
			if (count > 1) {
				System.out.println("\n"+ array[i] + " --> " + count);
			}
		}

	}

}
