package Methods;

import java.util.Scanner;

public class Test1 {
   public static void main(String[] args) {
	   
      Test1 s = new Test1();
      s.subtractTwoValues(250, 120);
      
      Test1 m = new Test1();
      m.multiplyValues(8, 5.68F, 20);
      
      Test1 d = new Test1();
      d.divideTwoValues(20, 4);
      
      Test1 mo = new Test1();
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter first value:");
      int h = scan.nextInt();
      System.out.println("Enter second value:");
      int i = scan.nextInt();
      mo.modulus(h, i);
   }

   public void subtractTwoValues(int a, int b) {
      int sub = a - b;
      System.out.println(sub);
   }

   public void multiplyValues(int c, float d, int e) {
      float mul = c*d;
      System.out.println(mul);
      
      float mul2 = c*d*e;
      System.out.println(mul2);
   }

   public void divideTwoValues(int f, int g) {
      int div = f / g;
      System.out.println(div);
   }

   public void modulus(int v1, int v2) {
      int mod = v1 % v2;
      System.out.println("Modulus of values(Remainder) is = " + mod);
   }
}
