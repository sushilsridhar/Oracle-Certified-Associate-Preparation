public class EqualityTest {
    EqualityTest() {}
    EqualityTest(int a) {
        this();
    }
    public static void main(String... args) {
        Integer value1 = new Integer("312");
        Integer value2 = new Integer("312");
        Object object1 = new Object();
        Object object2 = new Object();
        Object object3 = value1;
        
        System.out.println(value1.equals(object3));
        System.out.println(value1.equals(value2));
        
        int[] arr = new int[4];
        //arr[4] = 1;
        
        //howMany(true, {true, true});
        
        int x = 1;
        
        if (x == 0) ; else if (x == 1){} else {;}
        
        try {
            
        }
        finally {
            System.out.println("Hello world");
        }
        
        String b = "12";
        b += "3";
        b.reverse();
        System.out.println(b.toString());
    }
    
    static void howMany(boolean a, boolean... arg) {
        
    }
}