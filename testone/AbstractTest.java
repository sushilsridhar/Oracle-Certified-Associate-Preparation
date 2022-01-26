 public abstract class AbstractTest {
    
    //public abstract void getName();
    
    public void layEggs() {
        System.out.println("laying eggs :P");
    }
     
    public static void main(String... args) {
        AbstractTest test = new AbstractClass();
        test.layEggs();
    }
}

class AbstractClass extends AbstractTest {
    public void layEggs() {
        System.out.println(": O");
    } 

}