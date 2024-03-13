package Overloading;

public class ABC {

	public static void main(String[] args) {
		 // Calling of method by creating an object of Class ABC
		ABC obj = new ABC();
		
		//obj.add(10, 20);  It will give error at the time of execution as- The method add(int, double) is ambiguous for the type ABC
		// Why error- because JVM get confused which values should be called on as double can also store int values.
		// Then what is the solution- we have to make any parameter as double data type
		
		obj.add(10.0, 20);  // it will call method 3

	}

	public void add(int a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}

	public void add(double a, double b) {
		double sum = a+b;
		System.out.println(sum);

	}

	public void add(double a, int b) {
		double sum = a+b;
		System.out.println(sum);
	}

}
