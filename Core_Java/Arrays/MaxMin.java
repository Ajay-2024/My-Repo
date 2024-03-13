package Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int A[] = { 35, 67, 89, 94, -234, 75, 300 };
		int Max = A[0];
		int Min = A[0];

		for (int i = 1; i < A.length; i++)
			if (A[i] > Max) {
				Max = A[i];
			}
		System.out.println("Max number is " + Max);
	
		for (int i = 1; i < A.length; i++)
			if (A[i] < Min) {
				Min = A[i];
			}
		System.out.println("Min number is " + Min);
	}

}
