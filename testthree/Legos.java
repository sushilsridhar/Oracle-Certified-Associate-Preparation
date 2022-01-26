public class Legos {
    
    public Legos(String now, int... deep) {}
    
    public Legos() {
        this("hello",1,2,3);
    }
    
    public static void main(String[] args) {
         StringBuilder sb = new StringBuilder();
         sb.append("red");
            System.out.println(sb);
         sb.deleteCharAt(0);
            System.out.println(sb);
         sb.delete(1, 1); // if start is equal to end no changes are made
            System.out.println(sb);
        
        //(5>4)? "hello": 1;
      }
}