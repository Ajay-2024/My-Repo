package thisKeyword;

public class Example2 {

	int age;
	double salary;
	
	/*
	Example2(int age, double salary) {
		age = age;
		salary = salary;
		
	  We will get default values of local variable when local & global(Instance Variable) have same name.
      So to access values of global(Instance Variable), we have to use this. keyword
	}
	*/
	
	Example2(int age, double salary) {
		this.age = age;        // Using this. keyword we can assign values of instance variables to local variables
		this.salary = salary;
	}

	public static void main(String[] args) {

		Example2 t = new Example2(76, 9876.55);
		System.out.println(t.age);
		System.out.println(t.salary);
	}
}
