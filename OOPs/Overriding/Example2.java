package Overriding;

class Animal1 {
	Animal1(){		
	}
	public void move() {
		System.out.println("Animals can move");
	}
}
class Dog extends Animal1 {
	Dog(){
		//super(); implicitly written by compiler because Animal1() constructor is non-parameterized.
	}
	 //Overridden method
	public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Animal1 a = new Animal1(); // Both Reference and object of Animal1 Class
		a.move();
		Dog b = new Dog(); // Reference and object of Dog class but move() is overridden so we get move() of Dog class.
		b.move();
		b.bark();
		
		System.out.println("....................");
		
		Animal1 a1=new Dog();
		a1.move();    // you will get Dog class move()  because it has overridden method.
	}

}
