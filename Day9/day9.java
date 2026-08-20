// Call by Value and Call by reference
public class day9 {
   public static void main(String[] args) {
    int x = 3;
    int y = 4;
    
    System.out.println(x + " , " + y);

    

    System.out.println(x + " , " + y);
   } 
    

    // Call by Reference
    addnum r = new addnum(4 , 5);
    addnum r1 = new addnum(r);

    static void add(addnum a){
     a.x = a.x + 10;
     a.y = a.y + 10;
    }
  
  


}

class addnum{
    int x = 4;
    int y = 6;

    addnum(int x , int y){
        this.x = x;
        this.y = y;
    }

    addnum(addnum a){
        this.x = a.x;
        this.y = a.y;
    }
    
}

