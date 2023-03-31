package DataAbstraction;
//Program for Interface:
interface Coffeee
{
    void taste1();

}
class ColdCoffeee implements Coffeee
{
    @Override
    public void taste1() {
        System.out.println("ColdCoffee Tastes less bitter and little Sweeter!");
    }
}
class HotCoffeee implements Coffeee
{
    @Override
    public void taste1() {
        System.out.println("HotCoffee is bitter in Taste");
    }
}
public class Interface6
{
    public static void main(String[] args) {
        Coffeee hot = new HotCoffeee();
        hot.taste1();
        Coffeee cold = new ColdCoffeee();
        cold.taste1();
    }
}

/*
   OUTPUT:-
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface6
    HotCoffee is bitter in Taste
    ColdCoffee Tastes less bitter and little Sweeter!

Process finished with exit code 0
 */