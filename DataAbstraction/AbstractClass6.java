package DataAbstraction;

abstract class Coffee
{
    abstract void taste();

}
class ColdCoffee extends Coffee
{
    @Override
     void taste() {
        System.out.println("ColdCoffee Tastes less bitter and little Sweeter!");
    }
}
class HotCoffee extends Coffee
{
    @Override
    void taste() {
        System.out.println("HotCoffee is bitter in Taste");
    }
}
public class AbstractClass6
{
    public static void main(String[] args) {
        Coffee hot = new HotCoffee();
        hot.taste();
        Coffee cold = new ColdCoffee();
        cold.taste();
    }
}

/*
   OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.AbstractClass6
    HotCoffee is bitter in Taste
    ColdCoffee Tastes less bitter and little Sweeter!

Process finished with exit code 0
 */