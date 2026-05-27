public class two {
    public static void main(String[] args) {
        // Function Overloading: Same function name but different parameters in function 
        sum(4,5);
        sum(4,5,6);
        sum(4.56, 4.6554);
        greet("Alice");
        greet("Alice" , 32);
    }
    static void sum(int a , int b){
        int x = (a+b);
        System.out.println("The sum of two numbers is:" + x);
    }
    static void sum(int a , int b ,int c){
        int x = (a+b+c);
        System.out.println("The sum of two numbers is:" + x);
    }
    static void sum(double a , double b){
        double x = (a+b);
        System.out.println("The sum of two numbers is:" + x);
    }

    static void greet(String name){
        System.out.println("My name is" + name);
    }
    static void greet(String name , int age){
        System.out.println("My name is" + name + "and my age is " + age);
    }
}
