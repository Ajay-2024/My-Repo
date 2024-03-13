package Arrays;

public class Remove_Element {

	public static void main(String[] args) {
		// Delete an element of index 2
		int[] A = new int[10];
		A[0] = 5;
		A[1] = 7;
		A[2] = 12;
		A[3] = 35;
		A[4] = 6;

		int n = 5; // Here n = length of an array

		System.out.print("Array of length 5 is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.println("");

		// To delete A[2] = 12, we have to shift elements leftward
		for (int i = 3; i < n; i++) {
			A[i - 1] = A[i];
		}
		System.out.print("New array after removing element of index 2 is : ");
		for (int i = 0; i < n-2 + 1; i++) {
			System.out.print(A[i] + ", ");
		}
	}
}
