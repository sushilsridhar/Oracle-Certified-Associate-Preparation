public class Return {
    
    public static void greet() {
        return;
    }
    
    public static String holla(int a) {
        if(a == 10)
            return "";
        return "";
    }
    
    public static void main(String... args) {
        greet();
        holla(10);
        
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}