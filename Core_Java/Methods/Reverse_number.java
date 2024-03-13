package Methods;

public class Reverse_number {

	public static void main(String[] args) {
		//Calling of reverseNumber()
		int a = 45632;
		int result = reverseNumber(a);
		System.out.println(result);
	}
	
	static int reverseNumber(int a)
	{
		int reverse = 0;
		
		for(;  a != 0; a = a / 10)
		{
			int remainder = a % 10;

			reverse = reverse * 10 + remainder;
		}
		return reverse;
		
	}

}
