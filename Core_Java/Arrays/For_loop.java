package Arrays;

public class For_loop {
   public static void main(String[] args) {
      int[] a = new int[]{100, 200, 300, 400, 500, 600};

      for(int i = 0; i < a.length; ++i) { 
         System.out.print(a[i] + " ");  // /traversing/accessing all element values of an array. Here i represents index & not direct value of element.
      }
      System.out.println("##########################");
      
      for(int i=a.length-1; i >= 0; i--) {
    	  System.out.print(a[i] + " ");  // getting reverse elements of an array.
      }
      System.out.println("****************************");
      
      // for each loop. Here we get direct values of element 
      for(int num : a) {
    	  System.out.println(num);
      }
      System.out.println("****************************");
      
      int[] b = new int[]{100, 200, 300, 400, 500, 600, 700, 900, 1200}; // Another type of declaration and initialization
      int[] var6 = b;
      int var5 = b.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         int i = var6[var4];
         System.out.println(i);
      }

   }
}
