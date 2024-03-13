package Pattern_Examples;

public class Half_pyramid {
   public static void main(String[] args) {
      int n = 6;

      for(int i = 1; i <= n; ++i) {
         int k;
         for(k = 1; k <= n - i; ++k) {
            System.out.print(" ");
         }

         for(k = 1; k <= i; ++k) {
            System.out.print("*");
         }

         System.out.println();
      }

   }
}
