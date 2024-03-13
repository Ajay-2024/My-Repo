package Object;

public class Test {
   byte a = 25;
   static byte b = 35;
   static byte c = 45;

   public static void main(String[] args) {
      Test t = new Test();
      System.out.println(t.a);
      System.out.println(b);
      System.out.println(c);
      new Test();
      System.out.println((new Test()).a);
   }
}
