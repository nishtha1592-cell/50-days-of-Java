public class Demo2 {
    public static void main(String[] args) {
        // Java Enums --> Enumerations --> Predefined set of constants
        /*
        There are some predefined methods in java enum class
        1. values() -- Give arrays of constant in enum
        2. valueOf() -- Convert a string into java enum constant and if the string is not valid then 
        it throws a exception 
        3. name() -- Give java enum name
        4. Ordinal() -- 
        */
        Direction a = Direction.EAST;
        System.out.println(a.getDegree());
        a.move();
        // System.out.println(a.ordinal());


    }
}

enum Direction{
    NORTH(0){
        @Override
        public void move(){
            System.out.println("North");
        }
    },
    SOUTH(180){
        @Override
        public void move(){
            System.out.println("South");
        }   
    },
    EAST(90){
        @Override
        public void move(){
            System.out.println("East");
        }
    },
    WEST(270){
        @Override
        public void move(){
            System.out.println("West");
        }
    };

   private int degree;
    Direction(int degree){
        this.degree = degree;
    }

    public int getDegree(){
        return this.degree;
    }
    public abstract void move();
}

