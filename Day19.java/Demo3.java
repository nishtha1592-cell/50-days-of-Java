public class Demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Alice");
        sb.append(",Jhon");
        sb.append(",Mary");
        
        System.out.println(sb);
        
        //insert
        System.out.println(sb.insert(15,"i"));

        //delete
        System.out.println(sb.delete(0,3));

        //delete chatacter at a specific index
        System.out.println(sb.deleteCharAt(15));

        //replace and reverse
        System.out.println(sb.reverse());
        System.out.println(sb.replace(0,6,"Maria"));

        sb.setCharAt(12,'y');

        //To see capacity of string
        sb.capacity();

        //To increase capacity
        sb.ensureCapacity(100);

        sb.trimToSize(); //this will trim the extra unnecessory space 

        


    }
}
