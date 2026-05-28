public class day8 {
    public static void main(String[] args) {
        // Constructor , Types of constructor and this keyword
        Student s1 = new Student("Alice" , "Excellence" , 23 , 12004565);
        
        
        System.out.println(s1.name);
        // System.out.println(s1.roll);
        // System.out.println(s1.clgname);
        // System.out.println(s1.age);

    }
    
}
class Student{
    String name;
    String clgname;
    int roll;
    int age;

    // Default Constructor
    Student(){
       this("Unknown");
       System.out.println("Constructor is called");
    }
    
    // Parameterzied Constructor
    // We use this keyword here(constructor ke baad this use krte h koi or task perform nhi kr skte)

    Student(String name){
        this(name , "Unknown");
        System.out.println("First Constructor is called!");
    }
    // We use this keyword for chaining also 
    Student(String name , String clgname){
        this(name , "Unknown", 0);
        System.out.println("This is second Constructor");
    }

    Student(String name , String clgname , int age){
        this(name ,"Unknown",0 , 0);
        System.out.println("This is third Constructor");
    }

    Student(String name , String clgname ,int age  ,int roll) {
        this.name = "Alice";
        this.clgname = "Excellence";
        this.age = 23;
        this.roll = 120034564;

        System.out.println("This is last constructor!!");
    }
     

}



