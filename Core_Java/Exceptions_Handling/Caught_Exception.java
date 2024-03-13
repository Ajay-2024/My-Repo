package Exceptions_Handling;

public class Caught_Exception {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Starting");
		try {

			int array[] = new int[5];

			array[5] = 100;

		} catch (Exception e) {
			System.out.println("Error Occurred");
		}

		System.out.println("Ending");

		Thread.sleep(1000);

	}

}
