package Exceptions_Handling;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {

			System.out.println("Beginning");

			int i = 10/0; // Arithmetic Exception
			
			System.out.println(i);
			                          /*It will give exception error like Exception in thread "main" java.lang.ArithmeticException: / by zero 
			                          * So to handle such exceptions we need to put it into try{} and catch{} and then run the program.*/
			
		} catch (Exception e) {  // Exception has 'E' as capital
			
			System.out.println("Error occurred");  // To know why error is occurred, we use e.getMessage()
			System.out.println(e.getMessage()); // Error occurred because we divide / by zero.
			
			// To know at which line and what type of error occurred, we use e.printStackTrace()
			//e.printStackTrace();
		}
		
		System.out.println("Ending");
	}
}
