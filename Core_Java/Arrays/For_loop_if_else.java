package Arrays;

public class For_loop_if_else {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 5, 6, 7, 9, 12, 23, 46 };

		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i] + " is Even number ");
			} else {
				System.out.println(arr[i] + " is Odd number");
			}
		}

	}
}
