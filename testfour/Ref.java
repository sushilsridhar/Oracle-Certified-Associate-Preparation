import java.util.*;

interface Contract {}
class Super implements Contract {}
class Sub extends Super {}


public class Ref {
    public static void main(String... args) {
        List objs = new ArrayList();
        Contract c1 = new Super();
        Contract c2 = new Sub();
        Super s1 = new Sub();
        
        String helo = "helllo";
        
        objs.add(c1);
        objs.add(c2);
        objs.add(s1);
        objs.add(helo);

        for(Object obj: objs) {
            System.out.println(obj.getClass().getName());
        }
    }
}