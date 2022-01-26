public abstract class MethodHidingTest {
    private void fly() {
        System.out.println("Bird is flying");
    }
    
    public static void main(String... args) {
        MethodHidingTest bird = new Pelican();
        bird.fly();
    }
}

class Pelican extends MethodHidingTest {
    protected void fly() {
        System.out.println("Pelican is flying");
    }
}