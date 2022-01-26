public class PrePost {
    public static void main(String []args) {
        int x = 4;
        long y = x * 4 - x++; // read increment and assign
        System.out.println(x+" "+y);
    }
    /*
        int x = 4;
        x = x * 4 - x++;
        System.out.println(x);
        */
}