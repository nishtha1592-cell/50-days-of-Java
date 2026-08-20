// Inheritence: parent(Superclass) --> Child(subclass)
// We use "extends " word to make subclass from baseclass
// Types of inheritence
// Simple inheritence
// Hierarchy inheritence
// Multilevel inheritence
// Multiple inheritence : Java doesn't support inheritence
public class Demo2 {
    public static void main(String[] args) {
        // EngStudent es = new EngStudent();
        // es.markattendance();
        // es.labattend();

        mammle M = new mammle();
        M.petname = "Dog";
        M.birdname = "Crow";
        M.mammles();

    
    }
}

class Student{
    String name;
    int rollnumber;
    
   public void markattendance(){
        System.out.println("Attendance marked: " + name );
    }
}

class EngStudent extends Student{
   public void labattend(){
    System.out.println("Lab Attended by: " + name );
   }
}

// Multilevel Inheritence
/*
    A
    |
    B
    |
    C
*/

class Animal{
    String petname;
    public void print(){
        System.out.println(petname);
    }

}

class bird extends Animal{
    String birdname;
    public void birds(){
        System.out.println(petname);
    }
    
}

class mammle extends bird{
    public void mammles(){
        System.out.println(birdname);
        System.out.println(petname);
    }
}

// Hierarchy Inheritence
/*
     A
    / \
   B   C
    
*/
