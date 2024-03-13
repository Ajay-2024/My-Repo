package Overriding;

//parent class
class Company {
	void display() {
		System.out.println("I am company class display()...");
	}
}
//child class of Company
class Employee extends Company {
	
	//Overridden method
	void display() {
		
		super.display();  // super. keyword used to call parent class method display() 
		
		System.out.println("I am Employee class display()...");
	}
	void callme() {
		System.out.println("I am Employee class callme()...");
	}
}

public class Example1 {

	public static void main(String[] args) {
		Employee e1=new Employee();  // Object created for Employee Class
		e1.display();  // Due to super. keyword used in line 15 i.e super.display(), Employee e1 first calls parent class(company) display() method.
		e1.callme(); // and then Employee class display().
		
		System.out.println("****************************");
		
		Company c1=new Company();  // Object created to access parent class display() method.
		c1.display();
		
		System.out.println("****************************");
		
		Company e2=new Employee();  // Reference of Company(Parent Class) but object created of Employee(Child Class).
		e2.display();
		
		/* Object created of Employee(child) class to access display() method of parent(company) class. 
		 * Even though we have called parent class method, overridden method will be executed i.e display() method of Employee class.
		 Due to super. keyword, we can able to access both Parent(Company) and Child(Employee) display() method.
		 */
	}
}
