public class StringB {
    public static void main(String[] args) {
        String s1= "java";
        StringBuilder s2 = new StringBuilder("java");
        
        StringBuilder s3 = new StringBuilder("java");
        //StringBuilder s3 = s2;
        
        //if(s1 == s2)  --> ERROR
          //  System.out.println("1");
        if(s1.equals(s2))
            System.out.println("2");
        
        if(s2 == s3) System.out.println("string builder ==");
        if(s2.equals(s3)) System.out.println("String builder equals");
        
        
        String s = "Hello";
        //String t = new String("Hello");
        String t = new String(s);
        
        if ("Hello".equals(s)) System.out.println("one");
        if (t == s) System.out.println("two");
        if (t.equals(s)) System.out.println("three");
        if ("Hello" == s) System.out.println("four");
        if ("Hello" == t) System.out.println("five");
        
        
        
        //------------------------------- 
        String a = "";    // compiler must know the values, so that it can be stored in string pool,
        a += 2;           // eg -- String a = "a" +"bc" -- stores in string pool  
        a += 'c';         // a.intern() --- manually get reference to value in string pool  
        a += false;
        if ( a == "2cfalse") System.out.println("A =="); // false
        //if ( a.intern() == "2cfalse") System.out.println("A =="); true
        if ( a.equals("2cfalse")) System.out.println("A equals");
        
        //---------------------------------
        
        StringBuilder puzzle = new StringBuilder("Java");
        puzzle.append("vaJ$").substring(0,4);
        System.out.println(puzzle);
        
        //--------------------------------
        //int[][] types = new int[]; // -- will not work
        java.util.Date[] dates[] = new java.util.Date[2][];
        
        //----------------------------------
        
        StringBuilder bu = new StringBuilder("Duke");
        String st = bu.toString();
        String st1 = bu.toString();
        System.out.println(st);
    }
}