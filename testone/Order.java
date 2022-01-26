class Order {
 
    private String name ;
 
    Order(int x) {
        System.out.println("In 1 argument constructor, name = " + this.name);
    }
 
    Order() {
        name = "prasad";
        System.out.println("In no argument constructor, name = " + this.name);
 
    }
 
    /* First static initialization block */
    static {
        System.out.println("In first static init block ");
    }
 
    /* First instance initialization block  */
    {
        System.out.println("In first instance init block, name = " + this.name);
    }
 
    /* Second instance initialization block */
    {
        System.out.println("In second instance init block, name = " + this.name);
    }
 
    /* Second static initialization block  */
    static {
        System.out.println("In second static int block ");
    }
 
    public static void main(String args[]) {
        new Order();
        new Order();
        new Order(7);
    }
 
}
/* 
Run the program using command java InitBlocksDemo. The program flows as follows

When program starts executing, the class InitBlocksDemo is loaded into JVM.
Static initialization blocks run when class is loaded in the order they appear in the program.
Now when execution of static block completed, main method is encountered.
The statement new InitBlocksDemo(); causes the no-argument constructor to be invoked.
 As there is a default call to the super no-argument constructor, control goes to super class i.e.  Object  class.
After it has completed, then control comes back to our class and starts giving default values to instance variables. In this case, variable name will be assigned value as null.
Now the instance blocks will execute in the order they appear in the program. We have not re-assigned value to name  variable yet so it will print null
After instance blocks are executed, then control goes to the constructor. Here name = "prasad"; will re-assign a new value hence “prasad” will get printed in the no-argument constructor.
The statement  new InitBlocksDemo(7);  causes the one-argument constructor to be invoked. Rest of the process is same. Only difference is that name is not re-assigned a new value hence it will print null
With the help of this, we can say

Initialization blocks run in the order they appear in the program
Static initialization blocks run when class is loaded in JVM
Instance initialization blocks run every time a new instance is created.
Instance initialization blocks run AFTER the super constructor has completed executing and BEFORE current class constructor.
They can be used to perform operations those are common to constructors.
*/