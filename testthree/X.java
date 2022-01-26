class X {
    String str = "default";
    X(){}
    X(String s) {
        str = s;
    }
    
    void print() {
        System.out.println(str);
    }
    public static void main(String[] args) {
        new X("Hello").print();
        
        new X("welcome").print();
        
        new X().print();
    }
}