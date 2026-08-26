public class Demo2 {
    public static void main(String[] args) {
        // Generics
        Box<Integer> b1 = new Box<>(10);
        Box<String> b2 = new Box<>("Alice");
        Box<Boolean> b3 = new Box<>(false);

        System.out.println(b1.getvalue());

        // For class Pair - Passing arguments in pair
        Pair<String , Integer> s1 = new Pair<>("Alice" , 45);


    }
}

class Box<T> {
    private T value;

    Box(T value){
        this.value = value;
    }

    public T getvalue(){
       return this.value;
    }

    public void setvalue(T value){
        this.value = value;
    }
}

// We can also pass parameters in pairs 
class Pair<X , Y>{

    X first;
    Y second;

    Pair(X first , Y second){
        this.first = first;
        this.second = second;

    }
}