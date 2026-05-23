// Loops(While,Do while and for loop)
public class day4 {
    public static void main(String[] args){
        int i = 1;

        /*while(espression){
            Do something
        } */

        while(i<=10){
            System.out.println(i);
            i++;
        }

        // DO while loop 
        /*
        do{
            Do something
        }while(expression); */
        
        do{
            System.out.println(i);
            i++;
        }while(i <= 10);

        // best for game:
        /*play game
          return last game
          exit */

        // for loop 
        for(i = 0;i <= 10 ;i++){
            System.out.println(i);
        }

        /*
        for(intialization,condition,increment){
            //do something
        } */

      // Comma seprated variation
      for(int num1 = 1, num2 = 1; num1 <= 10; num1++, num2+=2){
        System.out.println(num1 * num2);
      }

    // Nested loop: printing pattern
    /*
    *
    **
    ***
    ****
    *****
    */
    outer: for(int n = 1;n <= 5 ; n++){
       inner:  for(int j = 1; j <= n;n++ ){
            System.out.print("*");
        }
        System.out.println();
    }
    
    // Jump Statment in java
    // break, continue
    // Program whether a number is prime or not 
    int p = 7;
    int a;
    for(a = 2; a < p;a++){
        if(p%a == 0){
            System.out.println("The number is not prime");
            break;
        }
    if(a == p){
        System.out.println("The number is prime");
    }
    }

    // Program to find if number is odd
    for(int l = 1; l <=10 ; l++){

        if(l %2 == 0){
            continue;
        }
        System.out.println(l);
    }
    // Code blocks
    first: {
        second: {
            third: {
                System.out.println("Hello Java!");
            }
        }
    }
    }
}
