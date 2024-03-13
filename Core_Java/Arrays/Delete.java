package Arrays;

public class Delete {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int b[] = new int[4];

		int index = 2;
		
		System.out.print("Original array a [] is : ");
		for (int i = 0; i < a.length; i++) { // Traversing through array index
			System.out.print(a[i] + ", ");
		}
		System.out.println(" ");
		
		for (int i = 0; i < a.length; i++) {
			if (i < index) {
				b[i] = a[i];
			} else if (i == index) {
				continue;
			} else {
				b[i - 1] = a[i];
			}
		}
		System.out.print("New array after deleting element at index 2 is: ");
		for (int i = 0; i <a.length-1; i++) {
			System.out.print(b[i] + ", ");
		}

	}

}
