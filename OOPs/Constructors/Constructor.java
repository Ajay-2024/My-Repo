package Constructors;

public class Constructor {
	
	String studentName = "Ajay";
	int rollNum = 35;
	
	String name;
	int roll;

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor();
		System.out.println(c.studentName);
		System.out.println(c1.studentName);
		System.out.println(c2.studentName);	
		// Every time object created, we get same copy of instance variable.
		// It is not possible practically to store differrent names of students in this manner. To overcome this we have to create a method
		System.out.println("*************************");
		
		c.provideInfo("Ajay", 45);
		System.out.println(c.name);
		System.out.println(c.roll);
		
		System.out.println("################################");
	
		c1.provideInfo("Rahul", 86);
		System.out.println(c1.name);
		System.out.println(c1.roll);
		
		// Here also problem is to call separate methods to call info for every student.
		// then what is the solution? Ans is through Constructor
	}
   
	public void provideInfo(String sname, int nroll) {
		name = sname;
		roll = nroll;
	}
	
}

/* Can we add returtn type to constructor?
Ans- Yes, we can but then Constructor became a method.

CONSTRUCTOR DO NOT HAVE RETURN TYPE EXPLICITLY. But it implicitly returns an object of a Class.

*/
