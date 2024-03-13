package Operators;

import java.util.Scanner;

public class Logical_operators {
   public static void main(String[] args) {
      int temp = 10;
      if (temp > 30) {
         System.out.println("It is a hot day!");
      } else if (temp >= 20 && temp <= 30) {
         System.out.println("It is a warm day!");
      } else {
         System.out.println("It is a cold day");
      }

      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the tem:");
      int tem = scanner.nextInt();
      if (tem > 30) {
         System.out.println("It is a hot day!");
      } else if (tem >= 20 && tem <= 30) {
         System.out.println("It is a warm day!");
      } else {
         System.out.println("It is a cold day");
      }

      Scanner scanner1 = new Scanner(System.in);
      System.out.println("You are playing the game. Press q or Q to quit");
      String response = scanner1.next();
      if (!response.equals("q") && !response.equals("Q")) {
         System.out.println("You are still playing the game.");
      } else {
         System.out.println("You quit the game");
      }

   }
}
