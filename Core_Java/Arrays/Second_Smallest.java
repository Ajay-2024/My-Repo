package Arrays;

public class Second_Smallest {

	public static void main(String[] args) {
		int[] a = { 10, 5, 20, 150, 25, 250, 102, 50 };
		int temp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {
				if (a[j] < a[j + 1]) {
					// swap a[j] and a[i]
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		System.out.print("Sorted Array in Descending order : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println("\nSmallest number is : " + a[a.length-1]);
		System.out.println("Second Smallest number is : " + a[a.length - 2]);
		System.out.println("Third Smallest number is : " + a[a.length - 3]);
	}

}
