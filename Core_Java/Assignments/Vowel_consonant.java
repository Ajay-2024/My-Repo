package Assignments;

import java.util.Scanner;

public class Vowel_consonant {

	public static void main(String[] args) {
		
		char alphabet = 'U';
		
		if(alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet =='U'  )
		{
			System.out.println("The given alphabet is Vowel");	
		}
		else
		{
			System.out.println("The given alphabet is consonant");
		}
			
		// Same can be done by asking alphabet from system/user
		
		int i = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		char alpha = scan.next().charAt(0);
		
		if(alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha =='U'  )
		{
			System.out.println("The given alphabet is Vowel");	
		}
		else if(alpha>='A' && alpha<='Z')
		{
			System.out.println("The given alphabet is consonant");
		}
		else
		{
			System.out.println("Invalid input");
		}
			
	}

}
