public class Demo2 {
    public static void main(String[] args) {
        // Methods in sting class
        String s1 = new String("AliceinWonderland");
        String s2 = new String("HelloWorld");

        // Length/Emptiness
        System.out.println(s1.length()); //17
        System.out.println(s1.isEmpty()); //space counts even if there is no character
        System.out.println(s1.isBlank()); //always blank even there is space

        //Character acess
        System.out.println(s1.charAt(2)); 
        char[] arr = s1.toCharArray();
        System.out.println(arr);

        //Comparison
        System.out.println(s1.equals(s2)); //checks refrences
        System.out.println(s1.equalsIgnoreCase(s2)); //ignore case

        //Lexicogarphic comparison --> dictionary based comparison
        System.out.println(s1.compareTo(s2));

        //Searching
        System.out.println(s1.contains("Wonder")); //true
        System.out.println(s1.indexOf("Wonder")); // checks index of string
        System.out.println(s1.lastIndexOf("Wonder")); //checks index of string but after first

        System.out.println(s1.startsWith("Al")); // checks if string starts with Al or not?

        //Extraction or Transformation
        System.out.println(s1.substring(0,7)); ///give Alicei

        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.strip()); 

        System.out.println(s1.repeat(4)); //will repeat 4 times
        System.out.println(s1.replace("Alice" , "Jhon"));
        System.out.println(s1.replaceAll("Alice" , "Jhon")); //Replace all alice in given string

        String s3 = "Alice-Jhon-Max";
        String[] arr2 = s3.split(","); 


        // Conversion
        // Advance --> intern() , format()
        String s4 = new String("Hello");
        String s5 = s4.intern();

        System.out.println(s4==s5);

        //format
        String name = "Alice";
        int age = 28;

        System.out.println("Hello" + " " + name + "," + "Your age is " + age );
        System.out.println(String.format("Hello %s, Your age is %s" , name , age));




    }
}
