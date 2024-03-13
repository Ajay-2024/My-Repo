package Functions;

import java.util.Scanner;

public class Sum_function {
   public static int calculateSum(int a, int b) {
      int sum = a + b;
      return sum;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a:");
      int a = scanner.nextInt();
      System.out.print("Enter b:");
      int b = scanner.nextInt();
      int sum = calculateSum(a, b);
      System.out.println("The sum of a and b = " + sum);
   }
}
