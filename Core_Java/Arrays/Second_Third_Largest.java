package Arrays;

public class Second_Third_Largest {

	public static void main(String[] args) {
		int[] array = { 10, 5, 20, 1500, 25, 250, 102 };
		// Method 1
		int max1, max2;
		max1 = max2 = array[0];
		// Iterate/Traverse through the array to find the largest element
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max1) {
				max2 = max1;
				max1 = array[i];
			} else if (array[i] > max2) {
				max2 = array[i];
			}
		}
		// Print the second largest element
		System.out.println("Second Largest element of the array is: " + max2);
		
		
		System.out.println("***********************");

		// Method 2
		// First sort the elements in Ascending order either for loop & swapping or
		// using sort() method

		int[] a = { 10, 5, 20, 150, 25, 250, 102, 50 };
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
		System.out.println("\nSecond Largest number is : " + a[a.length - 2]);
		System.out.println("Third Largest number is : " + a[a.length - 3]);
		System.out.println("ForthLargest number is : " + a[a.length - 4]);

	}

}
