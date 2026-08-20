// Anonyms class
public class Demo4{
    public static void main(String[] args) {
       Outer outer = new Outer(){
        @Override
        void print(){
            greet();
            System.out.println("---> HII <---");
        }
        void greet(){
            System.out.println("I am a Person");
        }
       };
        outer.print();
    }
}
class Outer{
    void print(){
    System.out.println("---> Hello <---");
    }
}

