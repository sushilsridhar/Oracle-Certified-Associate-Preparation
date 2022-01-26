public class StringBuilderTest {
    public static void main(String... args) {
        StringBuilder b = new StringBuilder("rumle4");
        
        //System.out.println(b.append(4));
        //System.out.println(b.deleteCharAt(3));
        //System.out.println(b.delete(3, b.length() - 1));
        
        
        
        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        System.out.println(s1.append(s2));
        System.out.println(s1);
        System.out.println(s1.substring(4)); // returns a new String
        System.out.println(s1);
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);
    }
}
