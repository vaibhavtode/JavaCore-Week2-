package ExceptionHandling;

public class JavaThrowExample
{
    //defining a method
    public static void checkNum(int num) {
        if (num<1){
            throw new ArithmeticException("\nAee..Dear, number is Negative,cannot calculate Square!");
        }
        else {
            System.out.println("Square of " +num +"is"+(num*num));
        }
    }

    public static void main(String[] args) {
        JavaThrowExample obj = new JavaThrowExample();
        obj.checkNum(-3);
        System.out.println("Rest of the code....");
    }
}

