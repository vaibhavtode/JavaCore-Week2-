package ExceptionHandling;

import java.util.Scanner;

public class TryCatchExample
{
    public static void main(String[] args) {
        int i = 100;
        int j =0;
        int c;
        while (true)
            try{
                c = i/j;//may throw exception
                }
            //handling the exception
            catch(Exception e)
            {
                //resolving the exception in catch block
                System.out.println("After handling, the result is: "+ i/(j+2));
                System.out.println("Yes or No?");
                Scanner sc = new Scanner(System.in);
                String in = sc.nextLine();
                if (in.equals("Yes") || in.equals("yes") || in.equals("YES")){
                    System.out.println("Ok Dear, Go and Enjoy COffee!");
                }
                else if(in.equals("No") || in.equals("no") || in.equals("NO")) {
                    System.out.println("Aee what no re, I will shoot you with Ak47!");
                }
                else if(in.equals("both") || in.equals("BOTH") || in.equals("Both"))
                {
                    System.out.println("Dear, You are a Kabutar!");
                }
                else
                {
                    break;
                }
            }
        }
    }
