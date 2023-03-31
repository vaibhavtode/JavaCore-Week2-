package ExceptionHandling;

public class TestCustomException {

    public static void main(String[] args) {
        try
        {
            checkAge(14);
        } catch (InvalidAgeForMarriage e)
        {
            System.out.println(e);

        }
    }

    public static void checkAge(int age) throws InvalidAgeForMarriage
    {
        if(age <= 18)
        {
            throw new InvalidAgeForMarriage("Aee What Reee, you're doing BAL-VIVAH.");
        }

    }
}

class InvalidAgeForMarriage extends Exception

{
    public InvalidAgeForMarriage(String msg)
    {
        super(msg);
    }
}


/*
OUTPUT:-

ExceptionHandling.InvalidAgeForMarriage: Aee What Reee, you're doing BAL-VIVAH.

Process finished with exit code 0

 */