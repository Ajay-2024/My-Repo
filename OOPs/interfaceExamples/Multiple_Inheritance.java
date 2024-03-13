package interfaceExamples;

public class Multiple_Inheritance implements Parent1, Parent2 {

	public void dance() { // Overridden method by providing method body { }

		System.out.println(" Let us dance in the party.");
	}

	public void play() {
		System.out.println(" Let us play the cricket.");
	}

	public static void main(String[] args) {

		// Calling of Overridden/inherited method dance() by creating object of Child
		// class Multiple_Inheritance
		Multiple_Inheritance MI = new Multiple_Inheritance();
		MI.dance();
		MI.play();

		Parent1 p = new Multiple_Inheritance(); // Polymorphic reference
		p.dance();
	}
}

interface Parent1 {

	public void dance();
}

interface Parent2 {

	public void dance();

	public void play();
}
