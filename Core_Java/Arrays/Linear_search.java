package Arrays;

import java.util.Scanner;

public class Linear_search {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the size of an Array: ");
      int size = scanner.nextInt();
      int[] num = new int[size];
      System.out.print("Enter the lements: ");

      int x;
      for(x = 0; x < size; ++x) {
         num[x] = scanner.nextInt();
      }

      System.out.print("Enter the number x: ");
      x = scanner.nextInt();

      for(int i = 0; i < num.length; ++i) {
         if (num[i] == x) {
            System.out.print("x is found at index : " + i);
         }
      }

   }
}
