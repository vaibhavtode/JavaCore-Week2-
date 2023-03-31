package ExceptionHandling;

public class ExceptionExample2
{
    public static void main(String[] args) {
        try{
            //Risky code that may cause Null Pointer exception
            String s = null;
            System.out.println(s.length());

        }catch(NullPointerException n){
            System.out.println(n);
        }
        ////Innocent code is present here
        System.out.println("Innocent code is present here...");
    }
}
