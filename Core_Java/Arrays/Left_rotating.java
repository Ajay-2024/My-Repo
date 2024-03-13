package Arrays;

public class Left_rotating {

	public static void main(String[] args) {
		int[] A = { 5, 9, 6, 10, 12, 45, 7, 3, 4, 8 };

		System.out.print("Original array A [] is : ");
		for (int i = 0; i < A.length; i++) { // Traversing through array index
			System.out.print(A[i] + ", ");
		}

		System.out.println();

		int temp = A[0];

		for (int i = 1; i < A.length; i++) {
			A[i - 1] = A[i]; // Shifting elements leftward by copying elements.

		}
		A[A.length - 1] = temp;
		System.out.print("Left rotated array A [] is : ");
		for (int x : A) {
			System.out.print(x + ", ");
		}
	}

}
