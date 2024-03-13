package If_else;

import java.util.Scanner;

public class Even_Odd {
   public static void main(String[] args) {
     
	   int n = 22;
      
	   if (n % 2 == 0) 
      {
         System.out.println("The number is even");
      } 
      else 
      {
         System.out.println("The number is odd");
      }

      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the number:");
      int a = scan.nextInt();
     
      if (a % 2 == 0) 
      {
         System.out.print("The number is Even");
      } 
      else 
      {
         System.out.print("The number is Odd");
      }

   }
}
