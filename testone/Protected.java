class Bird {
    protected String text = "floating";
    protected void helloWorld() {
        System.out.println(text);
    }
}

class Goose extends Bird {
    
}

public class Protected {
    public static void main(String... args) {
        Goose goose = new Goose();
        Bird bird = new Goose();
        bird.helloWorld();
        goose.helloWorld();
    }
}