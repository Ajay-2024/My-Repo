package wrapper_Classes;

public class AutoBoxing {

	public static void main(String[] args) {
		// Converting primitive data type int to its Wrapper Class Integer
		int A = 10;
		Integer obj = (Integer)A;  // Wrapping or Autoboxing
		System.out.println(obj);
		
		// Converting object class Integer into primitive data type int 
		int i = obj.intValue();  //Unwrapping or Unboxing
		System.out.println(i);

	}

}

//AutoBoxing is converting a primitive value into an object of the corresponding wrapper class. For example, converting int to Integer class. 
//UnBoxing is converting an object of a wrapper type to its corresponding primitive value. For example conversion of Integer to int.

//AutoBoxing and UnBoxing will happens automatically in Collections.