class StringTest {
    public static void main(String... args){
        StringBuilder str = new StringBuilder("Hello");
        String str1 = str.toString();
        String str2 = str.toString();
        System.out.println(str1==str2);
    }
}