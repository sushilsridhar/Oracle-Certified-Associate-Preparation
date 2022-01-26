public class Variable {
    private int a = 10;
    private static int b = 20;
    
    public void method() {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String... args) {
        Variable var = new Variable();
        var.method();
        System.out.println(var.a);
        System.out.println(b);
    }
}