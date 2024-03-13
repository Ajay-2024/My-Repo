package Overriding;

class Dog1 {
	public void bark() {
		System.out.println("woof ");
	}
}

class Hound extends Dog1 {
	public void sniff() {
		System.out.println("sniff ");
	}
	// Overridden method
	public void bark() {
		System.out.println("bowl");
	}
}
public class Overriding {

	public static void main(String[] args) {
		Dog1 dog = new Hound();
		dog.bark();  // Overridden method can be executed even though we have called parent class method
	}
}

/*
Overridden method: when we declare a method in child class which is already present in parent class
In overriding we can increase the visibility of overridden method.
Order of visibility --> private(less) --> default--> protected--> public(High)
default ---> protected or public
protected ---> protected or public
public ----> public

# members not participate in overriding
	- static method
	- final method
	- private method
	- constructor
	
In java we can increase the visibility of members but we can not decrease it.
(private----> default or protected or public) is not possible.
(public ---> default or private or protected)

private member of parent class can't be overridden
*/

