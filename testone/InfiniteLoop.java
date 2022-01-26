public class InfiniteLoop {
    public static void main(String[] args) {
        for(int i =0; i<=10;) {
            i = i++; // read increment and assign
            System.out.println("Hello World");
        }
        
        /*
        
        a++ is known as postfix.

        add 1 to a, returns the old value.

        ++a is known as prefix.

        add 1 to a, returns the new value. 
        
        */
    }
}