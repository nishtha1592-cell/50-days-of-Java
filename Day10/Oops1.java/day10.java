// Encapsulation
public class day10{
    public static void main(String[] args) {
        // Access Modifiers 
        // Private : 
        // Public : 
        // Default :
        // Protected : 
        Student s1 = new Student();
        s1.print("Alice");

    Bank ba = new Bank();
    ba.deposit(1400);
    ba.withdraw(289);
    System.out.println("Your Total Ammount " + ba.getbalance());
        
    }
}
class Student{
    private String name ; int age ; 
    
    void print(String name){
        System.out.println("Attendance marked: " + name);
    }
     
   
}

class Bank{
    private double bankbalance;
    

    public void deposit(int money){
         bankbalance += money;
    }

    public void withdraw(int money){
      bankbalance -= money;
    }
    public double getbalance(){
        return bankbalance;
    }
}
