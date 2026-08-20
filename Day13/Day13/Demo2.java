
// Inner class
public class Demo2 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        // Outer.Inner inner = new Outer.Inner();
        // Outer.Inner inner = new Outer().new Inner();
        inner.fun();
        inner.fun2();
        Outer.Inner.fun2();
    }
}
class Outer{
    static int x = 10;
    class Inner{
        void fun(){
            System.out.println("---> Hello <---");
        }
        static void fun2(){
            System.out.println(x);
        }
    }
}