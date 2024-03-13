package Methods;

public class method_demo {
   public static void main(String[] args) {
      method_demo d = new method_demo();
      d.getData();
      demo2 d1 = new demo2();
      d1.getUserData();
      getData2();
   }

   public void getData() {
      System.out.println("Hello World");
   }

   public static void getData2() {
      System.out.println("Hello Universe");
   }
}
