package Arrays;

public class Inserting {

	public static void main(String[] args) {
		int[] A = new int[10];
		A[0] = 5;
		A[1] = 7;
		A[2] = 12;
		A[3] = 35;
		A[4] = 6;
		A[5] = 44;

		int n = 6;
		System.out.print("Array of length 6 is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + ", ");
		}
		System.out.println("");

		int x = 20; // To insert 20 at index 2.
		int index = 2;

		// Shifting of elements right side
		for (int i = n; i > index; i--) {
			A[i] = A[i - 1];
		}
		A[index] = x;
		
		System.out.print("Array after inserting 20 at index 2 is: ");
		for (int i = 0; i < n; i++) {   // Getting array after inserting new element
			System.out.print(A[i] + ", ");
		}
		System.out.println();
		// Getting array after inserting new element without deleting last element 44
		System.out.print("Array without deleting last element is: ");
		for (int i = 0; i < n + 1; i++) {
			System.out.print(A[i] + ", ");
		}
	}
}

// insertion will be possible only when there is free space in array.
// While inserting, elements should move towards right side. (rightward rotating)