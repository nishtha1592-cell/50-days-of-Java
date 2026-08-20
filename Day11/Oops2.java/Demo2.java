public class Demo2 {
    public static void main(String[] args) {
        // Interfaces
        Car C = new FuelCar();
        C.brake();
        C.start();

    }
}

interface Car{
    public void start();
    public void brake();
   
}

class FuelCar implements Car {
    @Override
    public void start(){
        System.out.println("Fuel Car is starting");
    }

    @Override
    public void brake(){
        System.out.println("Fuel Car is Stopped");
 
    }
}

class ECar implements Car{
    @Override
    public void start(){
        System.out.println(" Electric Car is Starting");
    }

    @Override
    public void brake(){
        System.out.println("Electric Car is Stopped");
    }
}