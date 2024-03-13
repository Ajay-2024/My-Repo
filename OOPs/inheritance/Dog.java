package inheritance;

public class Dog extends Animal {

	public static void main(String[] args) {
		            // Here to get Generic sound, Dog class has to create a method for that. But Dog class can use this method of Animal class using
		           // inheritance concept without creating its own method.
		//Object creation.        It has to create an object with same name as Dog class
		Dog d = new Dog();
		            //d.sound(); this will give an compile error- The method sound() is undefined for the type Dog.
		           //So in order to access this sound() from animal we have to add extends Animal in Dog class
		
		d.music();  // Now by adding extends Animal after Dog in Class we can able to use sound() method.
		
		          // Here Dog class is Child class while Animal is Parent class. Child is inheriting attributes from Parent
	}
}
