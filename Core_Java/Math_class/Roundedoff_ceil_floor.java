package Math_class;

public class Roundedoff_ceil_floor {
   public static void main(String[] args) {
      double a = 3.456D;
      double b = 5.67D;
      double c = (double)Math.round(a);
      double d = Math.floor(a);
      double e = Math.ceil(b);
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
   }
}
