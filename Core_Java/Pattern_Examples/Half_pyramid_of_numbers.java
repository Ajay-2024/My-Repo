package Pattern_Examples;

public class Half_pyramid_of_numbers {
   public static void main(String[] args) {
      int n = 6;

      for(int i = 1; i <= n; ++i) {
         for(int j = 1; j <= i; ++j) {
            System.out.print(j + " ");
         }

         System.out.println();
      }

   }
}
