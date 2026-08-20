public class Demo {
    public static void main(String[] args){
        // Immutable class --> it could be content private members plus final keyword
        // Immutable class content no setters
        College college = new College("IITG" , "Assam");
        Student S1 = new Student(29 , "Alice" , college);

        System.out.println(S1.getCollege().name);
        S1.getCollege().name = "IITB";
        System.out.println(S1.getCollege().name);
        // S1.getName();
        // S1.getCollege();

    }
}
// Not purely immutable
final class Student{
    private final String name ;
    private final int age;
    private final College college;

    // Constructor
    Student(int age , String name , College college){
        this.name = name;
        this.age = age;
        this.college = college;
    }

    // getters
    public int getAge(){
        return this.age;
    }
    
    public String getName(){
        return this.name;
    }

    public College getCollege(){
        return this.college;
    }


}
class College{
    String name;
    String address;

    College(String name , String address){
        this.name = name;
        this.address = address;
    }
}
