public class day3{
    public static void main(String[] args){
        // Conditional Statment:
        // There are 3 types of flow of control- selection,iteration, jump
        // if 
        int i = 3;
        if(i > 2){
            System.out.println("True");
        }
        
        // if else 
            if(i > 2){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        // WAP for even and odd number for an integer i
       int num = 7;
       int remain = num%2;

       if(remain == 0){
        System.out.println("Number is Even");
       }
       else{
        System.out.println("Number is Odd");
       }
        // Nested if
        int number = 9;
        // if-else-if ladder
        if(number==5){
            System.out.println("True");
        }
        else if(number==6){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
        // program:
        int age = 23;
        if(age == 18 && age > 18){
            System.out.println("You can vote.");
        }
        else{
            System.out.println("You are not elgible to vote.");
        }

        // Switch Statement
        int m = 5;
        switch(m=5){
            case 1:
                System.out.println("False");
             case 2:
                System.out.println("False");
             case 3:
                System.out.println("False");
             case 4:
                System.out.println("False");
             case 5:
                System.out.println("True");
     }
        // Nested Switch also exists
        
    }

}