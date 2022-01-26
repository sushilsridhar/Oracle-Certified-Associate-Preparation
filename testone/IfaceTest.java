interface MyInterface {
    default int doStuff() {
        return 42;
    }
}

interface MyInterface1 {
    default int doStuff() {
        return 45;
    }
}


public class IfaceTest implements MyInterface,MyInterface1 {
    public static void main(String[] args) {
        new IfaceTest().go();
    }
    
    void go() {
        System.out.println("class : " + MyInterface1.super.doStuff());
    }
    
    public int doStuff() {
        return 43;
    }
}
