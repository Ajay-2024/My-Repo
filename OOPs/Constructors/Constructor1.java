package Constructors;

public class Constructor1 {
	String studentName;
	int rollNum;
	
	// Creating a Constructor with same name as Class with no return type.
		public Constructor1(String studentName, int rollNum) {  // constructor created by user (user defined constructor)
			this.studentName = studentName;
			this.rollNum = rollNum;
		} 
		// this. keyword always points to the current/latest object created.
	// When Instance & Local variables have different names then we can call instance variable using constructor, 
		// But when they have same name then we use this.keyword
		/*public Constructor1(String sName, int rNum) {
			studentName = sName;
			rollNum = rNum;
		}
		*/

	public static void main(String[] args) {
		 // Creating object to call instance variables
		Constructor1 s = new Constructor1("Amar", 101);
		System.out.println(s.studentName);
		System.out.println(s.rollNum);
		
		Constructor1 s1 = new Constructor1("Akbar", 102);
		System.out.println(s1.studentName);
		System.out.println(s1.rollNum);
		
		Constructor1 s2 = new Constructor1("Anthony", 103);
		System.out.println(s2.studentName);
		System.out.println(s2.rollNum);
        // We will get default values of String and int i.e null and 0   Why?
		// Because instance variable and local variable of Constructor Constructor1 are same. So priority goes to Local variable where nothing is stored.
		//So we have to use this. keyword to access instance variable.
	}

}
