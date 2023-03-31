package ExceptionHandling;

import java.util.Scanner;

public class TestCustomException1 extends Exception
{
    public static void main(String[] args) {
        while(true)
            try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your password");
            String pass = sc.nextLine();
            if (pass.length()!= 10)
            {
                TestCustomException1 u = new TestCustomException1();
                throw u;
            }
            System.out.println("pass"+pass);
            break;
        }
        catch (TestCustomException1 u1)
        {
            System.out.println("Aeee..it is an Invalid Password Dear!");
        }
    }
}

/*
OutPut:-
Enter your password

        vaibhav@1998
        Aeee..it is an Invalid Password Dear!
        Enter your password
        vaibhav
        Aeee..it is an Invalid Password Dear!
        Enter your password
        vaib
        Aeee..it is an Invalid Password Dear!
        Enter your password
        vaibhav123
        passvaibhav123

 */