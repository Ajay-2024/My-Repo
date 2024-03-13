package Variables;

public class variable2 {
	static float n1 = 33.66f;
	static float n2 = 66.34f;
	float result = n1+n2;

	public static void main(String[] args) {
		System.out.println(n1);
		System.out.println(n2);
		
 //System.out.println(result);   //it give compile error because result has been declared as instance variable. So we have to create a new object
		
		variable2 v2 = new variable2();
		
		//v2.result = n1+n2; we can also get same result without this declaration
		
		System.out.println("Addition of two numbers = " + v2.result);

	}

}
