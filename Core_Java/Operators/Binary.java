package Operators;

public class Binary {
   public static void main(String[] args) {
      int a = 13;
      int b = 2;
      System.out.println(a / b);
      
      int c = 13;
      double d = 2.0D;
      System.out.println((double)c / d);
      
      double e = 13.0D;
      byte f = 2;
      System.out.println(e / (double)f);
      
      
      long l = 100l;
      float o = 20.56f;
      double u = 120.0;
      float v = 35.8968f;
      double d1= u+=v;
      System.out.println(d1);
      
      short s = 10;
      char r = 97;
      System.out.println(s + r);
      
      int s1 = 10;
      char r1 = 'a';  // ASCII value of 'a' = 97
      System.out.println(s1+r1);
      
   }
}
