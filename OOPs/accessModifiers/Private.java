package accessModifiers;

public class Private {
	
	private int accNum = 12345;  // Private instance variable
	
	private void display() {  // private method
		
		System.out.println("My Account Number is " + accNum);
	}
	public static void main(String[] args) {
		
		Private p1=new Private(); // Calling of private instance variable and method through object creation of class Private.
		System.out.println(p1.accNum);
		p1.display();
	}
}

// trying to access private members in other class in same package, will give error- not visible outside the class.
/*class AccessPrivate {
	public static void main(String[] args) {
		
		Private p1=new Private();
		System.out.println(p1.accNum);  // The field Private.accNum is not visible
		
		p1.display();  //The method display() from the type Private is not visible
	}
}

/* private members are accessible within the same class only and not outside the class in same package.
 * They also not participated in Inheritance 
 */