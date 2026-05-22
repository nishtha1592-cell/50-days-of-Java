public class pr {
    public static void main(String[] args) {
        // whether a number is positive or not 
        int num = 8;

        if(num >= 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is not positive");;
        }

        // Even or Odd
        int remain = num % 2;
        if(remain == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

        // Voting eligibility
        int age = 15;
        if(age >= 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }

        // Greater of two number
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println("Number"+ a + "is greater than" + b);
        }
        else{
            System.out.println("Number"+ b + "is greater than" + a);
        }

        // Temprature 
        int temp = 19;
        if(temp < 10){
            System.out.println("Very Cold");
        }
        else if(temp >= 10 && temp < 25){
            System.out.println("Moderate");
        }
        else{
            System.out.println("Hot");
        }
        
        // Student Grade Calculator
        int marks = 89;
        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 75){
            System.out.println("Grade B");
        }
        else if(marks >= 60){
            System.out.println("Grade C");
        }
        else if(marks >= 40){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Fail");
        }

        // Largest of three numbers 
        int c = 6;
        if(a > b){
            System.out.println("a is greater");
        }
        else if(b > c){
            System.out.println("b is greater");
        }
        else{
            System.out.println("c is greater");
        }
        // Number sign check 
        if(num > 0){
            System.out.println("Positive Number");
        }
        else if(num == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative number");
        }

        // Day of week using switch
        int day = 1;
        switch(day = 1){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thrusday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
        }

        // Simple calculator
        switch(a){
            case 1:


        }

        // Bonus: check is a year is leap year
        int year = 2024;
        if(year % 400 == 0){
            System.out.println("Year is leap");
        }
        else if(year % 4 == 0){
            System.out.println("Year is leap");
            if(year % 100 != 0){
                System.out.println("Year is leap");
            }
            else{
                System.out.println("Year is not leap");
            }
        }
        else{
            System.out.println("Year is not leap");
        }
    }
}
