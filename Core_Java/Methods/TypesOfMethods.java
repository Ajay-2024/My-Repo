package Methods;

public class TypesOfMethods {

	int i = 25;

	static int s = 78;

	public static void main(String[] args) {

		// Always use Class name to call a static property(variable or method)
		System.out.println(TypesOfMethods.s);

		// Always use object to call a non-static property(variable or method)
		System.out.println(new TypesOfMethods().i); // object created
		// TypesOfMethods obj = new TypesOfMethods();

	}

	public void add() {
		// To call subtract method in add(), use Class name as subtract() is static
		TypesOfMethods.subtract();
		
		// To call non-static method multiply() in add()- we have to create an object
		new TypesOfMethods().multiply();
		
	}

	public static void subtract() {

	}

	public void multiply() {

	}

}
