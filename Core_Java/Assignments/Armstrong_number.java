package Assignments;

public class Armstrong_number {

	public static void main(String[] args) {
		         // Armstrong Number = Sum of the cubes of unit digits of a number. Example- 153 = (1^3)+(5^3)+(3^3)
		int a = 371; 
		int original = a;
		int result = 0;
	
		while(original != 0)
		{
			int rem = original % 10; 

			result = (result + (rem*rem*rem));
			original = original/10;
		}
		if(result == a) 
		{
			System.out.println(a + " is Armstrong number");
		}
		else
		{
			System.out.println(a + " is not Armstrong number");
		}

	}

}
