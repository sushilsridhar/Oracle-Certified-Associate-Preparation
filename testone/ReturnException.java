public class ReturnException {
    
    public static Exception getException() throws Exception {
        throw new Exception();
    }
    public static void main(String... args) throws Exception {
        System.out.println(ReturnException.getException());
    }
}