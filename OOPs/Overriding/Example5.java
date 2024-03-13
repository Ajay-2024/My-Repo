package Overriding;

class Parent2 {
	/* private methods are not overridden, because private member doesn't participate in inheritance  */
	
	private void m1() {
		System.out.println("From parent m1()");
	}

	protected void m2() {
		System.out.println("From parent m2()");
	}
}

class Child2 extends Parent2 {
	// new m1() method
	// no overriding here as its a private method, unique to Child class
	public void m1() {
		System.out.println("From child m1()");
	}

	// overriding method is possible by changing access modifiers- with more visibility from protected to public
	@Override
	public void m2() {
		System.out.println("From child m2()");
	}
}

public class Example5 {

	public static void main(String[] args) {
		Parent2 obj1 = new Parent2(); // Calling Parent2's m2() method
		obj1.m2();

		/* obj1.m1();//compile time error because m1 is private method hence not accessible from outside the class.  */
		Child2 c = new Child2();
		c.m2();
		//OR We can call m2() overridden method using polymorphic reference as object created is of Child class
		// This is known as polymorphic reference
		Parent2 obj2 = new Child2(); // Reference of Parent2 but Object of Child2, we get overridden method m2().
		obj2.m2();
	}
}
