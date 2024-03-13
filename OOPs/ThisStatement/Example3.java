package ThisStatement;

public class Example3 {

	String name;
	int age;

	public Example3(String name) {
		this();
		System.out.println("I am " + name);
	}

	public Example3(int age) {
		this("Ajay");
		System.out.println("I am " + age + " Years old.");
	}

	public Example3() {
		System.out.println("Hello, welcome to my college.");
	}

	public static void main(String[] args) {

		Example3 student = new Example3(35);
	}
}
