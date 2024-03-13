package For_Loop;

public class Sum_of_even_no {
   public static void main(String[] args) {
      int sum = 0;
      int count = 0;

      int sum1;
      for(sum1 = 2; count < 10; sum1 += 2) {
         sum += sum1;
         ++count;
      }

      System.out.println("The sum of even numbers is:" + sum);
      
      sum1 = 0;
      int count1 = 0;

      for(int i = 1; count1 < 10; i += 2) {
         sum1 += i;
         ++count1;
      }

      System.out.println("The sum of odd numbers is: " + sum1);
      int a = 10;
      int b = 20;
      int sum2 = 0;

      for(int i = a; i <= b; ++i) {
         if (i % 2 == 0) {
            sum2 += i;
         }
      }

      System.out.println("The sum of even numb bw 10 & 20 is:" + sum2);
   }
}
