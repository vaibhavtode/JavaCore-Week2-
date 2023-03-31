package ExceptionHandling;

public class ThrowAndThrows
{
    //Declaring a user defined method
    //which will throw ArithmeticException
    static void vaibhav() throws ArithmeticException
    {
        System.out.println("inside of the method");
        throw new ArithmeticException("Throwing ArithmeticException");

    }
    //Declaring main method
    public static void main(String[] args)
    {
        try {
            vaibhav();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught in main() method");
        }

    }
}


/*
OUTPUT:
inside of the method
Caught in main() method

Process finished with exit code 0

 */