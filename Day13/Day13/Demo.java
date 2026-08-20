
// Types of classes
        // Nested class(Using static keyword before class)
        // Inner class(not using static keyword before class)
        // Local class(can make in any code block is called local class)
        // Anonyms class(made without name and cant make constructor in it.)



// Qualities of this classes:
    // 
public class Demo {
    public static void main(String[] args) {
     Outer outer = new Outer();

        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();


    }
}
class Outer{
    static int x = 3;
     void print(){
        System.out.println("Hello!! How are you??");
    }

    static class Inner{
        Outer outer;
        int x = 7;

         Inner(Outer outer){
         this.outer = outer;
         }
        void fun(){
            System.out.println(x);
            System.out.println("Hello ---> How are you --->");
        }
       

    }
}

