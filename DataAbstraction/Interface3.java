package DataAbstraction;

//Program for Interface
interface Gymm
{
    void benefitsss();

}
class GoldsGymm implements Gymm
{
    @Override
    public void benefitsss() {
        System.out.println("Gold's Gym is best for muscle Training");
    }
}

class Fit7Gymm implements Gymm
{
    @Override
    public void benefitsss() {
        System.out.println("Fit7Gym is best for Weight Loss");
    }
}

public class Interface3
{
    public static void main(String[] args) {
        Gymm gy = new GoldsGymm();
        gy.benefitsss();
        Gymm gz = new Fit7Gymm();
        gz.benefitsss();
    }
}

/*
Output:
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface3
Gold's Gym is best for muscle Training
Fit7Gym is best for Weight Loss


Process finished with exit code 0
 */