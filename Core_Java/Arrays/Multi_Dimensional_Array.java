package Arrays;

public class Multi_Dimensional_Array {
   public static void main(String[] args) {
      int[][] a = new int[3][2];
      a[0][0] = 100;
      a[0][1] = 200;
      a[1][0] = 300;
      a[1][1] = 400;
      a[2][0] = 500;
      a[2][1] = 600;
      System.out.println("Length is " + a.length);
      System.out.println("Length is " + a[0].length);
      System.out.println("Length is " + a[1].length);
      System.out.println("Length is " + a[2].length);
   }
}

//we can't get a length of complete array but length of each array within an array.'