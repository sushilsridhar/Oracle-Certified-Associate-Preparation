public class Initiliazer {
    
    
    private String name;
    
    { System.out.println(name); }
    
    public Initiliazer() {
        System.out.println("TEST");
    }
    public static void main(String[] args) {
        Initiliazer initiliazer = new Initiliazer();
    }
}