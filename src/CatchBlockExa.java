public class CatchBlockExa {
    public static void main(String[] args) {
        try{
            int i=10/0;
            System.out.println("Rest of the code1");
        }
        catch(ArithmeticException obj){
            System.out.println(obj);
            System.out.println("Can't divided by zero");
        }
        System.out.println("Rest of the code2");
    }
}