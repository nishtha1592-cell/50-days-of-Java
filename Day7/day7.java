public class day7 {
    // Object oriented programming with JAVA
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Alice";
    s1.clgname = "Excellence";
    s1.print();
    }
}
class Student{
    String name;
    String clgname;

    void print(){
        System.out.println("Attandance marked of " + name + " and he is from " + clgname + " college.");
    }


}


