public class strings {
    public static void main(String[] args) {
        // Strings and its methods

        // Two ways to assgin stringd
        // Literal: stored in string pool
        String name = "Alice";
        String Name = "Alice";

        // Using new Operator: Stored in heap
        String s1 = new String("Alice");

        System.out.println(name == s1);
        System.out.println(name == Name);

        String s2 = "Ja" + "va";
        String s3 = "Java";

        System.out.println(s2 == s3); //true

        String s4 = "Hello";
        String s5 = s4 + " World";
        String s6 = "Hello world";

        System.out.println(s5 == s6); //false

        String s7 = "Hello";
        String s8 = s7;
        
        System.out.println(s7 == s8);

        String s9 = new String("Hello");
        String s10 = "Hello";

        System.out.println(s9 == s10); //false

        String s11 = "Hello";
        s11 = "World";

        System.out.println(s11); //World

        // Problem of immutability
        String num = "";
        for(int i = 0 ; i < 5 ; i++){
            num += i; 
            System.out.println(num);
        }

        //"" --> "0" --> "01" --> "012" --> "0123" --> "01234"





    }
}