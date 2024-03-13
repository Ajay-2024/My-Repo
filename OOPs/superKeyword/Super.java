package superKeyword;

public class Super {

	public static void main(String[] args) {
		Horse h = new Horse();
		System.out.println("Color of Horse is : " + h.color); // calling of instance variable using reference variable h.
		
		// calling of printColor() method which is a overridden method
		h.printColor(); 
		/*It returns printColor() of Child class Horse.
		and using super. keyword in Child class horse, we can also access printColor() of Parent Animalia class.
		*/
		
		// To access/call instance variable color & method of Animalia class, we have to create an object
		Animalia a= new Animalia();
		a.printColor();
	    System.out.println(a.color);
		
	}
}

class Animalia {
	String color = "white";  // Instance Variable
	void printColor() {
		System.out.println("Color of Animalia is " + color);
}
}
//Inheritance
class Horse extends Animalia {
	String color = "black";  
    String color1 = "red";
          @Override // printColor() method of Parent Animalia Class overridden by Child Class Horse.
	void printColor() {
		super.printColor(); // using super. keyword we can also call printColor() method of Parent class without creating separate object for Animalia.
		System.out.println("Color of Horse is " + color1);
		
		// calling of instance variable color from Parent Class Animalia using super.keyword
		System.out.println("Color of Animalia Class is " + super.color);  
	}
}

/* In the above example, Animalia and Horse both classes have a common property color. 
 * If we print color property, it will print the color of current class by default. 
 * To access the parent property, we need to use super. keyword.
 */
