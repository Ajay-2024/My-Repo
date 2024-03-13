package superKeyword;

class Parent {
	void show() {
		System.out.println("Parent is showing");
	}
}
class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	void show() {
		super.show();
		System.out.println("Child is showing");
	}
}
class GrandChild extends Child {
	// This method overrides show() of Child
	@Override
	void show() {
		super.show();
		System.out.println("GrandChild is showing");
	}
}
public class Super_keyword {

	public static void main(String[] args) {
		Parent obj = new GrandChild();  // polymorphic reference of Parent class using object of GrandChild class.
		obj.show();
		
		System.out.println("##############################");
		
		// Same result printed even by creating object & reference variable of Grand child class due to inheritance.
		GrandChild g = new GrandChild();
		g.show();
	}
}

// super.keyword is used to access method and instance variables of parent class by child class and of child class by grand child class.



