public class Increment {
    public static void main(String... args) {
        int a = -10;
        int b = 17;
        int c = ++a;
        int d = b--;
        c++;
        d--;
        System.out.println(c+" ,"+d);
    }
}