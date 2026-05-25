public class day5 {
   public static void main(String[] args) {
    int[] rollnum = new int[3];
        rollnum[0] = 101;
        rollnum[1] = 102;
        rollnum[2] = 103;
     
    // printing length of array
     System.out.println(rollnum.length);
    //indexing
    System.out.println(rollnum[0]);
    // printing numbers one by one
    for(int i = 0; i < rollnum.length ; i++){
        System.out.println(rollnum[i]);
    }

    // add numbers is array using loops
    int[] rollcall = new int[5];
    int x = 101;
    for(int i = 0; i < 5;i++){
        rollcall[i] = x;
        x++;
    }

    // Multi dimensional array
    int[][] marks = new int[3][];

    marks[0] = new int[3];
    marks[1] = new int[2];
    marks[2] = new int[3];

    /*
    [50] [70] [40] 
    [10] [50] 
    [80] [70] [40]
    */
    marks[0][0] = 50;
    marks[0][1] = 70;
    marks[0][2] = 40;

    marks[1][0] = 10;
    marks[1][1] = 50;
    
    marks[2][0] = 80;
    marks[2][1] = 70;
    marks[2][2] = 40;
    
    
    // Printing elements of multi dimensinal arrays
    for(int row = 0 ; row < marks.length;row++){
        for(int col = 0;col < marks[row].length;col++){
            System.out.print(marks[row][col]+ " ");
           
        }
         System.out.println();
    }
    
    // 1-D arrays
    int[] rollnums = {101 , 102 , 103};
    int[][] numbers = {
                    {1,2,3} ,
                    {1,2,3} ,
                    {1,2,3}
                    };
   } 
}
