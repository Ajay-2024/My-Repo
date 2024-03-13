package Math_class;

import java.util.Scanner;

public class Simple_interest {
   public static void main(String[] args) {
      Scanner scanner1 = new Scanner(System.in);
      System.out.println("Enter the Principal amount: ");
      int p = scanner1.nextInt();
      System.out.println("Enter the Rate of interest: ");
      float r = scanner1.nextFloat();
      System.out.println("Enter the time in year: ");
      int t = scanner1.nextInt();
      float si = (float)p * r * (float)t / 100.0F;
      System.out.println("Simple interest is : " + si);
   }
}
