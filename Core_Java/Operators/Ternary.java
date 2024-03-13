package Operators;

import java.util.Scanner;

public class Ternary {  // Ternary operators are ? and :
   public static void main(String[] args) {
      float f = 23.45F;
      float g = 67.2635F;
      System.out.println(g > f ? "Largest value is " + g : "Largest value is " + f);
      
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the value of a: ");
      int a = scanner.nextInt();
      System.out.print("Enter the value of b: ");
      int b = scanner.nextInt();
      System.out.println(a > b ? "Largest value is " + a : "Largest value is " + b);
      
      int x = 210;
      int y = 138;
      int z = 59;
      System.out.println(x > y ? (x > z ? "Largest value is " + x : "Largest value is " + z) : (y > z ? "Largets valus is" + y : "Largest value is" + z));
   }
}
