package Functions;

import java.util.Scanner;

public class Functions {
   public static void MyName(String name) {
      System.out.println(name);
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String name = scanner.next();
      MyName(name);
   }
}
