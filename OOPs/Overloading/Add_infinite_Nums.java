package Overloading;

public class Add_infinite_Nums {

	public static void main(String[] args) {
		
		//Calling of method add() through object creation of Class 
		Add_infinite_Nums a = new Add_infinite_Nums();
		
		a.add(4,6);
		a.add(1,2,3,4,5,6);
		a.add(22,34,567,12,78);
		a.add(2,6,78,9,45,6,5,34,56,78,90,232,45,78,63,33,55);
	}
	
	public void add( int a, int b) {  // This method has no value if we create var-args method
		int result = a + b;
		System.out.println(result);
	}
	
	public void add( int a, int b, int c) {  // This method has no value if we create var-args method
		int result = a + b + c;
		System.out.println(result);
	}
	
	// Create a method to add multiple numbers through only one method.

	public void add(int... var) {  // This is known as var-args- this is applicable for any type of data type.
		// this is nothing but converting variables var into an int Array implicitly.
		int sum = 0;
		for(int i=0; i<var.length; i++)
		{
			sum = sum + var[i];
		}
		System.out.println(sum);
	}
}
