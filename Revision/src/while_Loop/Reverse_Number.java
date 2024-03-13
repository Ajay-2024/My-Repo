package while_Loop;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int Original = num;
		int reverse = 0;

		// while Loop
		while (num != 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println("The reverse of " + Original + " is " + reverse);

	}

}

/*while Loop Syntax

while (condition){    

//code to be executed   
 
 Increment / decrement statement  
}
    
*/