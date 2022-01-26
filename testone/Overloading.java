public class Overloading {
    
    public void fun() {
        System.out.println("normal fun");
    }
    
    public static void fun(String a) {
        System.out.println("static fun");
    }
    
    public double fun(double d) {
        return d;
    }
    
    public static void main(String[] args) {
        
        new Overloading().fun("a");
        System.out.println(new Overloading().fun(9.0));
    }
}