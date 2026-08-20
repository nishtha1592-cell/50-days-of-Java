
// Local class
public class Demo3 {
    public static void main(String[] args) {
        Outer outer = new Outer();
       outer.greet();
    }
}
class Outer{
    void greet(){
       String x = "Alice";

        class Local{
            void sayhi(){
                System.out.println("HELLO! ---> My name is <--- "+ x);
            }
        }
        Local local = new Local();
        local.sayhi();
    }
}