package Arrays;

public class Array2 {
	// creating a method which receives an array as a parameter
	static void min(int arr[]) {// int arr[] a = { 33, 13, 4, 50,15,1 };
		int min = arr[0]; // 33
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {// 33>13 | 13>4 | 4>50 | 4>15 | 4>1
				min = arr[i]; // 13 | 4 | 1
			}
		}
		System.out.println("Min number in array is : " + min);
	}

	static void max(int arr[]) {// int arr[]a = { 33, 13, 4, 50,15,1 };
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {// 33<13 | 33<4 | 33<50 | 50<15 | 50<1
				max = arr[i]; // 50
			}
		}
		System.out.println("Max number in array is: " + max);// 50
	}

	public static void main(String[] args) {
		int a[] = { 33, 13, 4, 50, 15, 1 };// declaring and initializing an array
		Array2.min(a);// passing array to method
		Array2.max(a);// passing array to method
	}

}
