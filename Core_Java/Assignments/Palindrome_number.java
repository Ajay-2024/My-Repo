package Assignments;

public class Palindrome_number {

	public static void main(String[] args) {
// A string/number is called a Palindrome if the reverse of the string is the same as the original one. For example, “madam”, “racecar”, “12321”.

		int p = 12321;
		
		int original = p;
		
		int reverse = 0;
		
		for(; p!=0; p = p/10)
		{
           int remainder = p%10;
			
			reverse = reverse*10 + remainder;
		}
		
		if(original == reverse)
		{
			System.out.println("The number " + original +  " is Palindrome");
		}
		else
		{
			System.out.println("The number " + original +  " is not Palindrome");
		}
		
		// Using While Loop
		
		int n = 897567;  int originalnum = n;
		
		reverse = 0;
				
		while(n!=0)
			
		{
			int remainder = n%10;
					
			reverse = reverse*10 + remainder;
					
			n = n/10;
		}
		
		if(originalnum == reverse)
		{
			System.out.println("The number " + originalnum +  " is Palindrome");
		}
		else
		{
			System.out.println("The number " + originalnum +  " is not Palindrome");
		}
						
	}

}
