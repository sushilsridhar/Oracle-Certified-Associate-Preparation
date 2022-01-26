class X {
    void do1() { 
        System.out.println("X");
    } 
}

class Y extends X {
    void do1() {  
        System.out.println("Y");
    }
    void do2() {}
}

class Chrome {
    public static void main(String[] args) {
        
        X x2 = new Y();
        x2.do1();
        
        ((Y)x2).do2(); // WHILE COMPILING , DO2 METHOD SHOULD BE ON X CLASS BECAUSE X2 IS OFF TYPE X, DURNING RUN TIME, do2() in Y class GETS CALLED
    }
}

