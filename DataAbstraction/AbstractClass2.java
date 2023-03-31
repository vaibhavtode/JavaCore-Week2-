package DataAbstraction;
//Program for Abstract Class
abstract class Gym
{
    abstract void benefits();
    void fitness()
    {
        System.out.println("Gymming makes us fit");
    }
}
class GoldsGym extends Gym
{
    @Override
    void benefits() {
        System.out.println("Gold's Gym is best for muscle Training");
    }
}

class Fit7Gym extends Gym
{
    @Override
    void benefits() {
        System.out.println("Fit7Gym is best for Weight Loss");
    }
}

public class AbstractClass2
{
    public static void main(String[] args) {
        Gym g1 = new GoldsGym();
        g1.benefits();
        g1.fitness();
        Gym g2 = new Fit7Gym();
        g2.benefits();
        g2.fitness();
    }
}

/*
Output:
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.AbstractClass2
Gold's Gym is best for muscle Training
Gymming makes us fit
Fit7Gym is best for Weight Loss
Gymming makes us fit

Process finished with exit code 0
 */