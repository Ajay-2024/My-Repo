package Functions;

import java.util.Scanner;

public class Factorial {
   public static void printFactorial(int n) {
      int factorial = 1;

      for(int i = n; i >= 1; --i) {
         factorial *= i;
      }

      System.out.println(factorial);
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter any value n:");
      int n = scanner.nextInt();
      printFactorial(n);
   }
}
