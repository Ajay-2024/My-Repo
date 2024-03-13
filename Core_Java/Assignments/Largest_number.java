package Assignments;

public class Largest_number {

	public static void main(String[] args) {
		
		int a =230;
		int b = 36;
		int c = 89;
		
		if(a>b && a>c)
		{
			System.out.println(a +  " is the largest number  among " + a + "," + b + "," + c +  ",");	
		}
		else if (b>a && b>c)
		{
			System.out.println(b + " is the largest number among " + a + "," + b + "," + c +  ",");
		}
		else
		{
			System.out.println(c + " is the largest number among " + a + "," + b + "," + c +  ",");
		}
		
		// Same can be done using Ternary operators
		
		int largest = ((a > b) ? (a > c ? a : c) : (b > c ? b : c));
	
		System.out.println(largest + " is the largest number among " + a + "," + b + "," + c +  ",");
	}

}
