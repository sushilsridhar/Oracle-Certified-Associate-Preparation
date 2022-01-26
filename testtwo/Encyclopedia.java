abstract class Book {
   protected String material = "papyrus";
   public Book() {}
   public Book(String material) {this.material = material;}
}

public class Encyclopedia extends Book {
   public String material = "cellulose";

   public Encyclopedia() {
       super();
   }
   
   public String getMaterial() {
       return super.material;
   }
    
   public static void main(String[] pages) {
       System.out.println(new Encyclopedia().getMaterial());
     
       Book book1 = new Encyclopedia();
       System.out.println("1"+book1.material);
       
       Book book2 = new Book();
       System.out.println("2"+book2.material);
       
       Encyclopedia book3 = new Encyclopedia();
       System.out.println("3"+book3.material);
   }
}
