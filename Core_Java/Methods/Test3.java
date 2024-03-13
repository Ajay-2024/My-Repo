package Methods;

public class Test3 {
   public static void main(String[] args) {
      Test3 t = new Test3();
      int result = t.addValues(120, 80);
      t.printResult(result);
   }

   public int addValues(int a, int b) {
      int sum = a + b;
      return sum;
   }

   public void printResult(int r) {
      System.out.println("Addition of two numbers = " + r);
   }
}
