public class Demo {
    public static void main(String[] args){
        // Java Enums 
        int a = PaymentStatus.SUCCESS;
        System.out.println(a);

        /*
         // Problem with this approach:
         1. values will be copy
         2. can change in values
         3. can change the values
         4. string also not easy to make
        */
    
    }
}
class PaymentStatus{
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;

}

class Role{
    public static final int USER  = 1;
     public static final int ADMIN  = 1;
}
