package Exceptions_Handling;

public class Array_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starting");
		try {
		int array[] = new int [5];
		
		array[6] = 100; // It will give an error because we have declared only upto index 5 and try to store value at index 6.
		
		// Console will show- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 5
		}catch(Exception e) {
			System.out.println("Error Occurred");
		}
		
		System.out.println("Ending");

	}

}
