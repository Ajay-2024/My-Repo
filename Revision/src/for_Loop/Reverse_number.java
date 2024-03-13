package for_Loop;

import java.util.Scanner;

public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("Please Enter the number :");
		int n = sc.nextInt();
		int Original = n;
		int reverse = 0;
	
		for(int i = n; i != 0; i = i/10) {
			int remainder = i % 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("The reverse of " + Original + " is " + reverse);
		
	}

}

/*For Loop Syntax
 for(initialization; condition; increment/decrement){    

//statement or code to be executed    

} 
   
*/