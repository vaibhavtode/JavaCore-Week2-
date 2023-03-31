package ExceptionHandling;

public class ExceptionExample3
{
    public static void main(String[] args) {

        try {
            //Risky code that may cause Number Format Exception
            String s = "vaibhav";
            int i = Integer.parseInt(s);

        }catch (NumberFormatException nf){
            System.out.println(nf);
        }
        //Innocent Code Section
        System.out.println("Innocent code/Rest of the code Section is here");
    }

}
