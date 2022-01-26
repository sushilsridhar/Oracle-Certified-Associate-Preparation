public class Copier {
  public static void main(String... original) {
      String[] copy = original;
      //System.out.println(copy.length + " " + copy[0]);
      
      System.out.println("Result: " + 2 + 3 + 5); 
      System.out.println("Result: " + 2 + 3 * 5);
      
      //call("121","!23123","1213");
      
      String bike1 = "speedy";
      String bike2 = new String("speedy");
      boolean test1 = bike1 == bike2;
      boolean test2 = bike1.equals(bike2);
      System.out.println(test1 + " " + test2);
      
      private String test = "jhellow";
      System.out.println(test);
      
   }
    public static void call(String[] args) {
        
    }
}