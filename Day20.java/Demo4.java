public class Demo4 {
    public static void main(String[] args) {
        Box<Fish> F = new Box<>();
    }
}
class Box<T extends Animal & Swim>{
   T value;
}

class Animal{
    void Display(){
        System.out.println("Displaying Animal");
    }
}

interface Swim{
    void Swim();
}

class Fish extends Animal implements Swim{
    @Override
    public void Swim(){
        System.out.println("Fish is Swimming");
    }

}
