package Overloading;

public class Overloading {  // Overloading = same method names but different parameter list
	
	public void add(int a, int b)  // Non-static method. So to call this method, we have to create an object of Class name.
	{
		int sum = a+b;
		
		System.out.println("The sum = " + sum);
	}
	     // Now if we want to update/requirement change to add 3, 4, 5 values and so on, here overloading comes into picture.
	    // method name add is same but both have different parameter list- this is overloading
	
	public void add(int a, int b, int c)
	{
		int sum = a+b+c;
		System.out.println("The sum = " + sum);
	}

	public static void main(String[] args) {
		Overloading over = new Overloading();  
		over.add(10, 20);  

		// Now even though we call add 2 values it doesn't give compile time error, JVM calls respective method accordingly.
// Similarly we can add 3 values. It is done at the compile time level so Overloading is also known as Compile Time Polymorphism.	
	}
}
