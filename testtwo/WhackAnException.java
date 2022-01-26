public class WhackAnException {
   public static void main(String... hammer) {
      try {
         throw new ClassCastException();
      } catch (IllegalArgumentException e) {
         throw new IllegalArgumentException();
      } catch (RuntimeException e) {
         throw new NullPointerException();
          System.out.println("catch block");
      } finally {
          System.out.println("finally");
         throw new RuntimeException();
          System.out.println("finally 2");
      }
   }
}