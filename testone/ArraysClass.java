import java.util.*;

public class ArraysClass {
    static public void main(String... args) {
        Integer[] ia = {1,2,3,4,5};
    
        System.out.println("original array "+Arrays.toString(ia));
        
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(ia));  //copy
        List<Integer> list2 = Arrays.asList(ia);
        
        System.out.println(list2.set(0,6));
        System.out.println("array "+ list2);
        System.out.println("original array "+Arrays.toString(ia));
        
        System.out.println(list1.add(6));
        System.out.println("arraylist "+list1);
        System.out.println("original array "+Arrays.toString(ia));
        
        //-------------------------------------
        
        List<Integer> list = Arrays.asList(10, 4, -1, 5);
        Collections.sort(list);
        Integer array[] = list.toArray(new Integer[4]);
        System.out.println(array[0]);
        
        //-----------------------
        
        List<Integer> ages = new ArrayList<>();
        int xaxa = Integer.valueOf("5");
        System.out.println("helo"+xaxa);
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null); // code compiles
        //for (int age : ages) System.out.print(age); // run time exception
        
        //-----------------------
   
		List<String> one = new ArrayList<String>();
		one.add("abc");
		List<String> two = new ArrayList<>();
		two.add("abc");
		if (one == two)
		  System.out.println("A");
		else if (one.equals(two)) //--- calls equals method in AbstractList.class (overrides equals method in Object class)
		  System.out.println("B");
		else
		  System.out.println("C");
        
    }
}