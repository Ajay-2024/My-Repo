package inheritance;

class Animal1 { // Parent class

	public void sound1() {
		System.out.println("Generic sound of an Animal");
	}
}

public class Cow extends Animal1 { // Cow as Child class inheriting sound() method of parent class
	public void play() {
		System.out.println("Let us play");

	}
	public static void main(String[] args) {
		Cow cw = new Cow();
		cw.sound1();
		
		Dog1 d = new Dog1();
		d.play();

	}
}

class Dog1 extends Cow {
	
}