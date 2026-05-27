public class three {
    public static void main(String[] args) {
    // Chaining of Function 
        A();
        System.out.println("Bye");

    }
    static void A(){
        B();
        System.out.println("How are you");
    }
    static void B(){
        C();
        System.out.println("Hi!!");
    }
    static void C(){
        System.out.println("Hello!");
    }
}
