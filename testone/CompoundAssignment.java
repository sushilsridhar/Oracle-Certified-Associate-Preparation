public class CompoundAssignment {
    public static void main(String []args) {
        long x = 10;
        int y = 10;
        
        //System.out.println(y = y * x); // error
        System.out.println(y *= x);
        int a;
        int zxzx;
        //System.out.println(zxzx); ---> error
        long z = (a=19);
        System.out.println(a+" "+z);
        System.out.println(Integer.class.isInstance(a));
        System.out.println(Long.class.isInstance(z));
    }
}