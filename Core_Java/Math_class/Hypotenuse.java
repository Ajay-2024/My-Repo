package Math_class;

import java.util.Scanner;

public class Hypotenuse {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the side x in cm: ");
      double x = scanner.nextDouble();
      System.out.println("Enter the side y in cm: ");
      double y = scanner.nextDouble();
      double z = Math.sqrt(x * x + y * y);
      System.out.println("The hypotenuse in cm is: " + z);
      scanner.close();
   }
}
