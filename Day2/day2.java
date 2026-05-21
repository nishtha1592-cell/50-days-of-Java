public class day2 {
public static void main(String[] args){
    // Type conversion in java: There are two types of data type conversion 
    // Implicit conversion: widening conversion which automatically convert by computer
    // byte to int

    byte b = 7;
    int i;
     i = b;
     System.out.println(i); 
    // same for short to int or int to long

    // char to int
    char c = 'a';
    int k;
    k = c;
    System.out.println(k);

    // Explicit conversion: we have to convert in manually

    // int to byte
    int one = 78;
    byte two;
    two = (byte) one;
    System.out.println(two);

    int num = 300;
    byte B ;
    B = (byte) i;
    System.out.println(B); //300%256
 
    // Truncating conversion
    float f = 15.75f;
    int L;
    L = (int) f;
    System.out.println(k);

    // Boolean does not change in any other data type
    // Type promotion 
    // first rule is that char,short and byte automatically convert into int data type
    // second rule is if one operand is in float then all covert in float
    // 3rd is if one operand is in int then all covert in int

    byte num1 = 50;
    int result = num*2;
    System.out.println(result);

    System.out.println("this is my first program" + " " + result + " " + "The value of num*2");


   }
}
