package If_else;

import java.util.Scanner;

public class Nested_if_else {
   public static void main(String[] args) {
      int day = 7;
      if (day == 1) {
         System.out.println("The day is Sunday");
      } else if (day == 2) {
         System.out.println("The day is Monday");
      } else if (day == 3) {
         System.out.println("The day is Tuesday");
      } else if (day == 4) {
         System.out.println("The day is Wednday");
      } else if (day == 5) {
         System.out.println("The day is Thursday");
      } else if (day == 6) {
         System.out.println("The day is Friday");
      } else {
         System.out.println("The day is Saturday");
      }

      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter your age:");
      int age = scanner.nextInt();
      if (age >= 75) {
         System.out.println("You are Dhalla");
      } else if (age > 74 && age < 18) {
         if (age < 18 && age >= 16) {
            System.out.println("You are adolescent");
         } else {
            System.out.println("You are child");
         }
      } else {
         System.out.println("You are Young");
      }

   }
}
