package Overriding;

class Man {
	void eat() {
		System.out.println("Man is eating");
	}
}
class Boy extends Man {
	
	// Overridden method
	public void eat() {
		System.out.println("Boy is eating");
	}
}
public class Human {

	public static void main(String[] args) {
		Boy obj = new Boy();
		obj.eat();
	}
}
