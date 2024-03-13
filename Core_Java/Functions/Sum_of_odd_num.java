package Functions;

import java.util.Scanner;

public class Sum_of_odd_num {
   public static int calculateSum(int n) {
      int sum = 0;

      for(int i = 1; i <= n; ++i) {
         if (i % 2 != 0) {
            sum += i;
         }
      }

      return sum;
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter n:");
      int n = scanner.nextInt();
      int sum = calculateSum(n);
      System.out.println("The sum of odd numbers = " + sum);
   }
}
