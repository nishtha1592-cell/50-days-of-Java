public class Demo {
    public static void main(String[] args) {
        //Upcasting and Downcasting
        // casting specific class to its parent class like object class is called Upcasting 
        // whereas, casting Object class or parent class to its child class is called Downcasting
        
        String s1 = "Hello";
        Object obj = s1;

        Object obj2 = "Alice";
        String s2 = (String) obj2;

        // It will give runtime error which is not optimism
        // And after running it will give classcastexception
        Object obj3 = 14;
        String s3 = (String) obj3;

        System.out.println(s1+","+s2+","+s3);

        Box b1 = new Box(10);
        Box b2 = new Box("Alice");
        Box b3 = new Box(true);

        //Downcasting

        Integer x = (Integer)b1.getvalue();
        String y = (String) b2.getvalue();
        Boolean B = (Boolean) b3.getvalue();
        

    }
}
class Box{
    private Object value;

    Box(Object value){
        this.value = value;
    }
    public Object getvalue(){
        return this.value;
    }
    public void setvalue(){
        this.value = value;
    }
}
