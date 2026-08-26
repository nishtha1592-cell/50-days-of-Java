public class Demo {
    public static void main(String[] args) {
        // Strings methods (Part-2 )

        String s1 = new String();

        String s2= new String("Hello");

        //Char array
        char[] arr = {'A','l','i','c','e',' ' ,'c','a','r','o','l'};
        String s3 = new String(arr);

        System.out.println(s3);

        //char array subset
        String s4 = new String(arr , 0 , 6);
        // offset - starting index(included)
        // count - ending index (excluded)
        System.out.println(s4);

        byte[] arr2 = {97 , 98 , 99};
        String s5 = new String(arr2 , 0 , 2);
        System.out.println(s5);

        // Stringbuffer and Stringbuilder
        StringBuilder sb = new StringBuilder("Hello");
        String s6 = new String(sb);

        StringBuffer SB = new StringBuffer(" World");
        String s7 = new String(SB);

        System.out.println(s6+s7);
    }
    
}
