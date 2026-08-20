import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        // Scanner class --> Utility class --> takes 'System' parameters
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String name = sc.nextLine();
        System.out.println("age = " + age);
        System.out.println("name = " + name);
    }
}
