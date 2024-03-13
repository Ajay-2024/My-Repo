package Strings;

public class Str {
	
   public static void main(String[] args) {
	   
      String s = "Ravindra Shivaji Chavhan";
      String[] splittedString = s.split("Shivaji");
      System.out.println(splittedString[0]);
      System.out.println(splittedString[1]);
      System.out.println(splittedString[0]);
      System.out.println(splittedString[1].trim());
   }
}
