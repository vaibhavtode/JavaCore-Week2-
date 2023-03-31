package ExceptionHandling;

public class JavaThrowsExample
{
    //Here i ll be Defining a method
    public static int divideNum(int m, int n) throws ArithmeticException
    {
        int div = m/n;
        return div;
    }

    //Here i ll be creating a main method
    public static void main(String[] args) {
        JavaThrowsExample obj1 = new JavaThrowsExample();
        try{
            System.out.println(obj1.divideNum(45,0));

        }
        catch (ArithmeticException e){
            System.out.println("\nNumber cannot be divided by 0");
        }
        System.out.println("Rest of the code...");
    }
}
