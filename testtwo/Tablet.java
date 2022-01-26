interface Gadget {
    void doStuff();
}

abstract class Electronic {
    void getPower() {
        System.out.println("Plug in ");
    }
}

public class Tablet extends Electronic implements Gadget {
    public void doStuff() {
        System.out.println("Show Books");
    }
    public static void main(String... args) {
        new Tablet().getPower();
        new Tablet().doStuff();
    }
}