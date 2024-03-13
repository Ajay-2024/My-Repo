package superKeyword;

class Animals {
	Animals(String sounds) { // Parameterized Constructor of Animals Class
		System.out.println("Sound of Animals is different");
	}

	String sound = "Aniaml sound";
}

class Lion extends Animals {
	String sound = "Roar";

	Lion() {  //Constructor of Lion Class
		super("Raoring"); // calling of Parent Class Animals constructor using super(). Due to this, it
							// executed first Animals constructor.
	}

	void printSounds() {
		System.out.println(sound);
		System.out.println(super.sound); // using super. we can access String variable sound of Parent Class.
		System.out.println("Lion is roaring in the jungle.");
	}

}

public class Example1 {

	public static void main(String[] args) {
		Lion l = new Lion();
		l.printSounds();
		System.out.println(l.sound); // Calling of sound variable of Lion class

		Animals a = new Lion(); // polymorphic reference
		System.out.println(a.sound);
		// a.printSounds(); We can not call Child class method using reference of Parent when that method is only present in Child class.
	}

}
