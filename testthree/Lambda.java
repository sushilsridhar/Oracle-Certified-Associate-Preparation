interface Predicate {
    boolean test(String c);
}

class Lambda {
    public static void main(String... args) {
        
        Predicate dash = (String c) -> c.startsWith("‐");
        System.out.println(dash.test(""));
        
        String helo = "7686";
        System.out.println(helo.startsWith("")); // returns true
    }
}