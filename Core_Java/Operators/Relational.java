package Operators;

public class Relational {
   public static void main(String[] args) {
      int a = 20;
      int b = 35;
      System.out.println(a < b);
      System.out.println(a > b);
      System.out.println(a <= b);
      System.out.println(a >= b);
      System.out.println(a == b);
      System.out.println(a != b);
      
      System.out.println("-------");
      
      String s1 = "Ajay";
      String s2 = "Ajay";
      String s3 = new String("Ajay");
      System.out.println(s1 == s2);
      System.out.println(s2 == s3);
      System.out.println(s1.equals(s2));
      System.out.println(s2.equals(s3));
   }
}
