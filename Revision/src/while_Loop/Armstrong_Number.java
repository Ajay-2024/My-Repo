package while_Loop;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = sc.nextInt();
		int Original = n;
		int result = 0;
		
		while(n != 0){
			int rem = n % 10;
			result = result + (rem*rem*rem);
			n = n / 10;
		}
		//If..else condition checking
		if(result == Original) {
			System.out.println("The number " + Original + " is Armstrong number ");
		}
		else {
			System.out.println("The number " + Original + " is not Armstrong number ");
		}

	}

}
