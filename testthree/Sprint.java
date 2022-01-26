interface Run {
   default void walk() {
      System.out.println("Walking and running!");
   }
}
interface Jog {
   default void walk() {
      System.out.println("Walking and jogging!");
   }
}
 
public class Sprint implements Run, Jog {
  /* public void walk() {
      System.out.println("Sprinting!");
   } */
   public static void main(String... args) {
        Jog run = new Sprint();
        run.walk();
   }
}