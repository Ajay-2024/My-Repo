package Arrays;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int a[] = { 30, 50, 60, 20, 18, 2 };

		System.out.print("Unsorted/Original Array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		System.out.println("");
		// OR by importing java.util.Arrays
		System.out.println("Unsorted/Original Array is : " + Arrays.toString(a));

		// Approach 1 Sorting using Arrays.parallelSort
		Arrays.parallelSort(a);
		System.out.println("Sorted/Ascending Array is : " + Arrays.toString(a));
		
		// Approach 2 using Arrays.sort method
		Arrays.sort(a);
		System.out.print("Sorted/Ascending Array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		
		// Reverse sorting / descending order
		
	}

}
