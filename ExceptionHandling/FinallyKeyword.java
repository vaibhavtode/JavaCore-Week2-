package ExceptionHandling;

public class FinallyKeyword
{
    public static void main(String[] args) {
        try {
            System.out.println("inside the main");
            int div = 45/0; //divide by 0 exception
            System.out.println(div);
        }
        //We ll be handling this exception
        catch(ArithmeticException e)
        {
            System.out.println("Aee..Beta Exception is handled!");
            System.out.println(e);
        }
        //Finally block is executed whether Exception is occured
        finally {
            System.out.println("I am not Depended on try catch blocks.");
            System.out.println("I am always Executed");

        }
        System.out.println("Rest of the code section[Innocent Code]");
    }
}
