// METHOD HIDING AND VARIABLE HIDING

class Marsupial {
    public final double secret = 2;
    
    public boolean isBiped() {
        return false;
    }
    
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs:"+ isBiped());
    }
}

class Kangaroo extends Marsupial {
    public final double secret = 4;
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs:"+ isBiped());
    }
}

public class MethodHiding {
    public static void main(String... args) {
        Kangaroo joe = new Kangaroo();
        joe.getMarsupialDescription();
        joe.getKangarooDescription();
        
        
        Marsupial k1 = new Kangaroo();
        System.out.println(k1.isBiped());
        System.out.println(k1.secret);
    }
}