package do_while_Loop;

import java.util.Scanner;

public class HCF_of_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First Number :");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second Number :");
		int b = sc.nextInt();
		
		int rem, hcf = 0;
		do
		{
			rem = a % b;
 
			if(rem == 0)
			{
				hcf = b;
			}
			else
			{
				a = b;
				b = rem;
			}
 
		}while(rem != 0);
 
		System.out.println("HCF : " + hcf);

	}

}
