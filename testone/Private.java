public class Private extends Parent {
    public static void main(String... args) {
        Private parent = new Private();
        System.out.println(parent.b);
    }
}

class Parent {
    private String a = "Hello";
    String b = "world";
    
    private String getA() {
        return a;
    }
}