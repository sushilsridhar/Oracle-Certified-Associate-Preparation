public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("54321");
        builder.substring(2);
        System.out.println(builder.charAt(1));
     }
}