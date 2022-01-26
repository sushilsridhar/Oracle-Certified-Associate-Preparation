public class X implements Z {
    public String toString() {
        return "X";
    }
    
    public static void main(String[] args) {
        Y myY = new Y();
        X myX = myY;
        Z myZ = myX;
        System.out.print(myX);
        System.out.print((X)myX);
        System.out.print(myZ);
        
        X x1 = myX;
        System.out.println(x1);
    }
}

class Y extends X {
    public String toString() {
        return "Y";
    }
}

interface Z {
    
}