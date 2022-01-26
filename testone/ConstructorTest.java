class Mammal {
    public Mammal(String name) {
        System.out.println(name);
    }
}

public class ConstructorTest extends Mammal {
    public ConstructorTest() {
        super("hello");
        System.out.println("world");
    }
    public static void main(String... args) {
        new Mammal("Test");
        //new ConstructorTest();
    }
}