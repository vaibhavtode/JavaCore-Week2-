package ExceptionHandling;

public class ExceptionExample4
{
    public static void main(String[] args) {
        try{
            //Faulty/Risky Code for ArrayIndexoutOfBoundException
            int a[] = new int[4];
            a[12] = 45; //ArrayindexoutofBoundException
        }catch (ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        }
        //Rest of the code Continues here
        System.out.println("Rest of the code continues from here...");
    }
}
