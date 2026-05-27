public class one {
    static String Name = "Nishtha"; // Global Varibale
    public static void main(String[] args) {
        // Types of function: Functions can made out of main function 
        greet();
        sayname();
        intro("Alice");
        intro2("Alice" , 32);

    }
    // No I/P , No O/P
    static void greet(){
        System.out.println("Hello!");
    }
    // No I/P , O/P
    static void sayname(){
        System.out.println("Hello world!");
        return;
    }
     // I/P , No O/P
    static void intro(String name){
        System.out.println("My name is" + name );
    }
     // I/P , O/P
    static void intro2(String name , int age){
        System.out.println("My name is" + name + "and my age is" + age);
        return;
    }

    
}
