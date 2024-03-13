package For_Loop;

import java.util.Scanner;

public class Login_testing_using_while_loop {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String Username = "Ajay@2020";
      String Password = "Shivmangal12";

      for(boolean isLoggedIn = true; isLoggedIn; isLoggedIn = false) 
      {
         System.out.print("Enter Username: ");
         String inputUsername = scanner.nextLine();
         System.out.print("Enter Password: ");
         String inputPassword = scanner.nextLine();
         
         if (!inputUsername.equals(Username) || !inputPassword.equals(Password)) 
         {
            System.out.print("Invalid credentials. Try again.");
            break;
         }

         System.out.print("Login is successful !");
      }

   }
}
