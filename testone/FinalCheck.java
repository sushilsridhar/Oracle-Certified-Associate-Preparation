import java.util.*;

public class FinalCheck {
    
    static final ArrayList<String> list = new ArrayList<>();
    
    static final int A;
    
    static {
        A = 10;
        System.out.println(A+" static initialized A");
    }
    {
        System.out.println("initializer");
    }
    
    public static void main(String... args) {
        list.add("Hello");
        System.out.println(list.size());
        list.add("Hello");
        System.out.println(list.size());
        list.remove("Hello");
        System.out.println(list.size());

       final int arr1[] = {1, 2, 3, 4, 5};
       int arr2[] = {10, 20, 30, 40, 50};
       arr2 = arr1;      
       //arr1 = arr2;   // final variable can't be assigned second time
       for (int i = 0; i < arr2.length; i++)
          System.out.println(arr2[i]);        
 
           new FinalCheck();
    }
}