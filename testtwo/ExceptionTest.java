import java.io.*;

public class ExceptionTest {
    public static void main(String... args) {
        try {
             System.out.println("work real hard");
            //throw new IOException();
        } 
        catch (StackOverflowError e) { } 
        catch (RuntimeException e) { }
    }
}