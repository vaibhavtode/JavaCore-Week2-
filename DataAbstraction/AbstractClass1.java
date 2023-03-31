package DataAbstraction;
//Program for AbstractClass
abstract class Tea   //A class having any abstract method must be abstract
{
    abstract void benefit(); //Abstract method doesn't have its body.
}
class lemonTea extends Tea
{
    void benefit()
    {
        System.out.println("Lemon tea is Good for Detoxification");
    }
}

//Any child class of abstract method must override its abstract method
class GreenTea extends Tea
{
    void benefit()
    {
        System.out.println("Green Tea is Good for Heart");
    }
}
class GingerTea extends Tea
{
    @Override
    void benefit() {
        System.out.println("Ginger Tea is Good for Digestive Issues");
    }
}
public class AbstractClass1
{
    public static void main(String[] args) {
        //we can create object of abstract class indirectly by using their child class
        Tea t1 = new GreenTea();
        t1.benefit();
        Tea t2 = new lemonTea();
        t2.benefit();
        Tea t3 = new GingerTea();
        t3.benefit();
    }
}

/*
OUTPUT:-
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.AbstractClass1
Green Tea is Good for Heart
Lemon tea is Good for Detoxification
Ginger Tea is Good for Digestive Issues

Process finished with exit code 0
*/