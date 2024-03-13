package Functions;

import java.util.Scanner;

public class Average {
   public static int calculateAvg(int a, int b, int c) {
      int Avg = (a + b + c) / 3;
      return Avg;
   }

   public static void main(String[] args) {
	   
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter a:");
      int a = scanner.nextInt();
      
      System.out.print("Enter b:");
      int b = scanner.nextInt();
      
      System.out.print("Enter c:");
      int c = scanner.nextInt();
      
      int Avg = calculateAvg(a, b, c);
      System.out.println("The Avg of a, b and c= " + Avg);
   }
}
