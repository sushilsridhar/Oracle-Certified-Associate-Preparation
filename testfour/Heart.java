class Organ {
   public void operate() throws RuntimeException {
      throw new RuntimeException("Not supported");
   }
}
public class Heart extends Organ {
   public void operate() throws Exception {
      System.out.print("beat");
       //throw new Exception();
   }
   public static void main(String... cholesterol) throws Exception {
      try {
         new Heart().operate();
      } finally {
      }
   }
}
