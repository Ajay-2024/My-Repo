package interfaceExamples;

public class Interface1 {
	
	public static void main(String[] args) {
		
		System.out.println("Interface variable salary = "+ Drawable.salary);
		
		Rectangle r1=new Rectangle();  // Overriding draw() by creating object of Child class Rectangle.
		r1.draw(); //drawing rectangle
		
		Circle c1=new Circle();       // Overriding draw() by creating object of Child class Circle.
		c1.draw(); //drawing circle
		
		Drawable d = new Circle();  // Polymorphic reference
		d.draw(); //drawing circle
	}

}
interface Drawable {

	int salary = 25000; //by default---> public static final int salary=25000;
	
	void draw();//by default---->public abstract void draw();
}

class Rectangle implements Drawable {
	public void draw() {
		System.out.println("Drawing Area of a rectangle");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("Drawing Area of a circle");
	}
} 

// This is hierarchical inheritance where child classes inheriting void draw() from parent interface using implements word instead of extends word.

/*
variable ---> by default ----> public static final
method ---> by default ----> public abstract
Interface has no complete methods/non-abstract and also no constructor.

As we are not allowed to create an instance of abstract class similarly we are not allowed to create instance of interface because its also incomplete)
--> when a interface is getting inherited by a sub class, then there will a contract between these classes that is
subclass needs to override all the abstract method of interface otherwise subclass becomes abstract class.
 * --> between 
 * 		1. two classes we use 'extends'
 * 	    2. two interface we use 'extends' 
 * 	    3. class and interface use 'implements' 
Example of Interface- an Animal interface might declare that all Animal implementation classes have an eat() method, 
but the Animal interface doesn’t supply any logic for the eat() method. That means it’s up to the classes that implement the Animal interface to
define the actual code for how that particular Animal type behaves when its eat() method is invoked.
 * 
 */