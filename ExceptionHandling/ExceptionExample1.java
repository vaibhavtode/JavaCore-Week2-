package ExceptionHandling;

public class ExceptionExample1
{
    public static void main(String[] args) {
        try{
            //Code that may cause exception/ RiskyCode
            int data = 100/0;
        }catch(ArithmeticException e) {
            System.out.println(e);
        }
        // Here is the portion of Innocent code
        System.out.println("Innocent code is here!!!");
    }
}
