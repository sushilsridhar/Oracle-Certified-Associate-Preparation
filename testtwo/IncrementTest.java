public class IncrementTest {
    public static void main(String... args) {
        int x = 5;
        
        while(isAvailable(x)) {
            //--x;
            System.out.println("final value"+ --x);    
            System.out.println("----------------------");
        }
    }
    
    public static boolean isAvailable(int x) {
        System.out.println("inside method "+x);
        boolean test = x-- > 0 ? true : false;
        System.out.println(x);
        System.out.println(test);
        return test;
    }
}