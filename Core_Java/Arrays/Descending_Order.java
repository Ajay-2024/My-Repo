package Arrays;

public class Descending_Order {

	public static void main(String[] args) {
		int[] a = { 64, 0, 34, 25, 12, 22, 55, 90, 2, -24, 78, 120 };
		int temp;
		System.out.print("Original Array is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}
		System.out.println(" ");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[j] > a[i]) {
					// swap a[j] and a[i]
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
// printing array in descending order
		System.out.print("Array in Descending order is : ");
		for (int x : a) {
			System.out.print(x + ", ");
		}

	}

}
