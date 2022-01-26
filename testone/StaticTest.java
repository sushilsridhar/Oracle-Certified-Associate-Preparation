public class StaticTest {
    private boolean numlock = true;
    static boolean capLock = false;
    
    float value = 5.0;
    
    public static void main(String... args) {
        final String name; // no public or static access modifiers
        System.out.println(" "+capLock);
    }
}

link3     link2      link1
z
link2 ---> y
           link1 ---> x 
                      null
                      

link3     link2      link1
z
link2 ---> y
           link3 ---> z
                      link2