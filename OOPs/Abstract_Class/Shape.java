package Abstract_Class;

public abstract class Shape {
	
	abstract void draw();

	public static void main(String[] args) {
		Shape s = new Rectangle();  // Polymorphic reference s of Parent class Shape with object of child class Rectangle.
		s.draw();
		
		Shape s1 = new Circle();  // Polymorphic reference s1 of Parent class Shape with object of child class Circle.
		s1.draw();
	}
}
// Hierarchical Inheritance

// Child Class Rectangle inheritance
class Rectangle extends Shape {
	// Overridden method inherited from parent abstract class Shape
	protected void draw() {
		System.out.println("Drawing rectangle");
	}
}
// Child Class Circle
class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing circle");
	}
}
