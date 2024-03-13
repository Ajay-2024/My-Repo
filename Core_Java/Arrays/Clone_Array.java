package Arrays;

import java.util.Arrays;

public class Clone_Array {

	public static void main(String[] args) {
		int array[] = { 33, 3, 4, 5 };//
		System.out.print("Printing original array : ");
		for (int i : array) {
			System.out.print(i + ", ");
		}
		System.out.print("\nPrinting clone of the array : ");
		int cloneArray[] = array.clone();
		for (int i : cloneArray) {
			System.out.print(i + ", ");
		}
		
		System.out.println("\nAre both equal arr & carr ?");
		System.out.println("array & cloneArray content validation : " + Arrays.equals(array, cloneArray));
		
		System.out.println("******************************");
		
		int newCopiedArray[] = Arrays.copyOf(array, array.length);//{ 33, 3, 4, 5 }
		for (int i : newCopiedArray){
			System.out.print(i+ " ");
		}
		System.out.println("\n******************************");

	}

}
