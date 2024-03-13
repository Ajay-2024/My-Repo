package inheritance;

public class BullDog extends Dog {

	public static void main(String[] args) {
		// BullDog can inherit properties of Dog class. But if Dog class not have its own properties & it inherited from Parent Animal class
		// Then BullDog inherit from GrandParent Animal class, but through an object creation
		
		BullDog bd = new BullDog();
		bd.music();  // Same output - Generic sound is printed in console
	}
}
