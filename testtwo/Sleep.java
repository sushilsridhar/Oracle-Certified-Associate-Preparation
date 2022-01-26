import java.io.*;
public class Sleep {
   public static void snore() {
      try {
         String sheep[] = new String[3];
         System.out.print(sheep[3]);
      } catch (RuntimeException e) {
         System.out.print("Awake!");
        throw new NumberFormatException();  // x1

      } finally {
          System.out.println("finally");
          throw new RuntimeException();
      }
   }
   public static void main(String... sheep) {  // x2
      new Sleep().snore();  // x3
   }
}