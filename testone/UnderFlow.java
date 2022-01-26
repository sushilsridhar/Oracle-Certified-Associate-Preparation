public class UnderFlow {
    public static void main(String []args) {
        System.out.println(2147483647 + 1); // -2147483648
        
        short x = 10;
        short y = 3;
        //short z = x * y; // error
        short z = (short) (x * y);  // no error
        System.out.println(z);
        
        
    }
}