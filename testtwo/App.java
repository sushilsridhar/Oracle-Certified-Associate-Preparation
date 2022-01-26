public class App {
    
    String myStr = "7007";
    
    public void doStuff(String str) {
        int myNum = 0;
        String myStr = null;
        try {
             myStr = str;
            myNum = Integer.parseInt(myStr);
        }
        catch(NumberFormatException e){
            System.err.println("Error");
        }
        System.out.println(myStr);
        System.out.println(myNum);
    }
    
    public static void main(String... args) {
        App obj = new App();
        obj.doStuff("9009");
    }
}