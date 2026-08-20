public class Demo1 {
    public static void main(String[] args) {
        // Abstraction class and Polymorphism 

        // Abstract class

        Car C = new FuelCar();
        C.brake();
        C.start();
        C.accelerate();

        Car B = new ECar();
        B.start();
        B.brake();
        B.accelerate();
    }
}

abstract class Car{
    void start(){
        System.out.println("Car is Starting");
    }
    abstract void brake();
    abstract void accelerate();
}

 class FuelCar extends Car{
    @Override
    void brake(){
        System.out.println("Fuel Car is stopped");
    }

    @Override
    void accelerate(){
        System.out.println("Fuel Car is Starting");
    }
}

class ECar extends Car{
    @Override
    void brake(){
        System.out.println("ECar is stopped");
    }

    @Override
    void accelerate(){
        System.out.println("Ecar is Starting");
    }
}