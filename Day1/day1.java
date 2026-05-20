// DAY1 
public class day1{
    public static void main(String[] args) {
        System.out.println("Hello, World!");

    /*
    <--- JVM , JDK or JRE --->
    JVM(Java virtual machine)
    JDK(Java seployment kit)
    JRE(Java runtime Environment)
    
    */

    
    // Data types
    // Integer: byte,short,int and long
    // binary(2), octal(8) , Hexadecimal(16) 
    // byte a = 5;
    // byte a = 07; --> octal number
    // byte a = 0b101; --> binary
    // byte a = 0X5 --> Hexadecimal (A,B,C,D,E,F)
    
    byte b = 4;
    short s = 16;
    int i = 24;
    long l = 19900;

    // decimal data values store in float and double data type
    float f = 23.45f;
    double d = 23.46575;

    // boolean data type
    boolean bool = false;

    // characters
    char c = 'a';
    }
}
// its doesnt count underscore(_) in between any integer numbers 
// for example 12_34_553

// How to store negative numbers:-
// range of int numbers is -128 tp +127 and in a 8bit there always one on MSB
// MSB(maximum significant bit) and LSB(lower significant numbers)
// steps- first make bianry of any nummber then take its complement then add one in it.



