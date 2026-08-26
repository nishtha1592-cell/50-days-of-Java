public class Demo3 {
    public static void main(String[] args) {
        // we can also create generic methods in java
        //<T> returntype methodname(){}
        //T can be bounded 
        
        String name = Result("Alice");
        System.out.println(name);

        printpair(23,74);
        printpair("Alice" , "Jhon");

        //for bounded generics: only any number or its subtype we can use
        Num <Integer> N1 = new Num<>();
        N1.Get(12);

        
    }
    public static <T> T Result(T x){
            return x;
        }
    
    public static <X , Y> void printpair(X first , Y second){
       System.out.println(first+","+second);
    }
}
class Num<T extends Number>{
    public void Get(T value){
        System.out.println(value);
    }
}
