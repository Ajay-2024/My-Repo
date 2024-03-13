package If_else;

import java.util.Scanner;

public class Input {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the name:");
      String name = scanner.nextLine();
      System.out.println(name);
      System.out.print("Enter a:");
      int a = scanner.nextInt();
      System.out.print("Enter b:");
      int b = scanner.nextInt();
      int sum = a + b;
      System.out.println("a + b = " + sum);
   }
}
