package Arrays;

import java.util.Arrays;

public class Copy {

	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		System.out.println("ELements count in copyFrom array: " + copyFrom.length);
		// declaring a destination array
		char[] copyTo = Arrays.copyOf(copyFrom, 6);
		System.out.println("ELements count in copyTo array: " + copyTo.length);
		for (int i = 0; i < copyTo.length; i++) {
			System.out.print(copyTo[i] + " ");
		}
		System.out.println("\n************Copy using range****************");
		char[] copyWithRange = Arrays.copyOfRange(copyFrom, 2, 7); // 7th index is not involved
		for (int i = 0; i < copyWithRange.length; i++) {
			System.out.print(copyWithRange[i] + " ");
		}
		System.out.println("\n****************After Sorting********************");
		Arrays.sort(copyWithRange);// it will sort array elements in ascending order and stored element in  the same array
							
		for (char c : copyWithRange) {
			System.out.print(c + " ");
		}

	}

}
