package Arrays;

public class Right_rotation {

	public static void main(String[] args) {
		int[] A = { 5, 9, 6, 10, 12, 45, 7, 3, 4, 8 };

		System.out.print("Original array A [] is : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}

		System.out.println();
// Storing last element 8 in temp variable.
		int temp = A[A.length - 1]; // A[A.length-1]; means element of 9th index, as array length is 10.

		for (int i = A.length - 1; i > 0; i--) { // Traversing through array index
			A[i] = A[i - 1]; // Shifting elements rightward by copying elements.
		}
		A[0] = temp;
		System.out.print("Right rotated array is : ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + ", ");
		}
	}

}
