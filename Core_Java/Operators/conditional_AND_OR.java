package Operators;

public class conditional_AND_OR {
   public static void main(String[] args) {
      int i = 10;
      int j = 20;
      System.out.println(i < j && j > i);
      System.out.println(i < j && j >= i);
      System.out.println(i < j || j == i);
      String s1 = "Ajay";
      String s2 = "Ajay";
      String s3 = new String("Ajay");
      System.out.println(s1 == s2 && s1 == s3);
      System.out.println(s1.equals(s2) && s1.equals(s3));
   }
}
