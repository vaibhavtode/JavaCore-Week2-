package DataAbstraction;

interface Tea1
{
    void benefitt(); //Abstract method doesn't have its body.
}
class lemonTea1 implements Tea1
{
    public void benefitt()
    {
        System.out.println("Lemon tea is Good for Detoxification");
    }
}

//Any child class of abstract method must override its abstract method
class GreenTea1 implements Tea1
{
   public void benefitt()
    {
        System.out.println("Green Tea is Good for Heart");
    }
}
class GingerTea1 implements Tea1
{
    @Override
    public void benefitt() {
        System.out.println("Ginger Tea is Good for Digestive Issues");
    }
}
public class Interface2
{
    public static void main(String[] args) {
        //we can create object of abstract class indirectly by using their child class
        Tea1 t1 = new GreenTea1();
        t1.benefitt();
        Tea1 t2 = new lemonTea1();
        t2.benefitt();
        Tea1 t3 = new GingerTea1();
        t3.benefitt();
    }
}

/*
OUTPUT:-
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface2
Green Tea is Good for Heart
Lemon tea is Good for Detoxification
Ginger Tea is Good for Digestive Issues

Process finished with exit code 0
*/