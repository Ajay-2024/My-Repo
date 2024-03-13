package Constructors;

public class Constructor_overloading {
	String studentName;
	int rollNum;
	
	public Constructor_overloading(String studentName, int rollNum) { // Creation of constructor with same name as that of Class name
		this.rollNum = rollNum;
	}
	
	// We can also overload the Constructor like a method.
	public Constructor_overloading(String studentName) {
		this.studentName = studentName;
	}
	
	public Constructor_overloading(String studentName, int rollNum, long mobileNum) {

	}
	
	public static void main(String[] args) {
		Constructor_overloading over = new Constructor_overloading("Shiv", 35);
		System.out.println(over);  // It will give address of an object stored in memory
		System.out.println(over.studentName);
		System.out.println(over.rollNum);
	}

}
