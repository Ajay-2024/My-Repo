package Arrays;

public class string_names {
   public static void main(String[] args) {
      String[] name = new String[]{"Ram", "seeta", "Hanuman", "Ravan", "Arjuna", "Bheema", "Draupadi"};

      for(int i = 0; i < name.length; ++i) {
         System.out.println(name[i]);
      }
System.out.println("################################");

      String[] var5 = name;
      int var4 = name.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         String s = var5[var3];
         System.out.println(s);
      }

   }
}
