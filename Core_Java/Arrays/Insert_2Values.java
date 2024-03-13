package Arrays;

public class Insert_2Values {

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
		int y = 30;
		int index = 2;
		int index1 = 4;
		
		// Inserting 20 at index 2
		for (int i = n; i > index; i--) {
			A[i] = A[i - 1];
		}
		A[index] = x;
		// Inserting 30 at index 4
		for (int i = n+1; i > index1; i--) {
			A[i] = A[i - 1];
		}
		A[index1] = y;
		
		System.out.print("Array after inserting 20 & 30 at indices 2 & 4 is: ");
		for (int i = 0; i < n; i++) {   // Getting array after inserting new element
			System.out.print(A[i] + ", ");
		} 
		
		System.out.println("");
		System.out.print("Array without deleting elemnts is: ");
		for (int i = 0; i < n+2; i++) {   // Getting array after inserting new elements at indices 2 & 4
			System.out.print(A[i] + ", ");
		}
	}

}
