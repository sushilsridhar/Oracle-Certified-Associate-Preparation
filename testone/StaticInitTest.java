public class StaticInitTest {
     public static void main(String... args) {
        StaticInitTestOne two = new StaticInitTestOne();
    }
}

class StaticInitTestOne {
    static {
        System.out.println("hello world : -");
    }
}

class StaticInitTestTwo {
    static {
        System.out.println("hello world :=");
    }
}

class StaticInitTestMain {
     static {
        System.out.println("hello world :P");
    }
}
