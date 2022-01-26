class RunClass {
    void walk() {
      System.out.println("Walking and running!");
   }
}
class JogClass extends RunClass{
    void walk() {
      System.out.println("Walking and jogging!");
   }
}
 
public class SprintClass extends JogClass {
   public void walk() {
      System.out.println("Sprinting!");
   }
   public static void main(String... args) {
        RunClass jog = new JogClass();
        jog.walk();
   }
}