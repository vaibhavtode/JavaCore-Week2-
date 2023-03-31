package DataAbstraction;

interface Sim
{
    void calling();
    void dataPack();
}

class Airtel implements Sim
{
    @Override
    public void calling() {
        System.out.println("Calling by using Airtel Sim!");
    }

    @Override
    public void dataPack() {
        System.out.println("Using Data Pack of Airtel");
    }
}
class Jio implements Sim
{
    @Override
    public void calling() {
        System.out.println("Calling via Jio Sim!");
    }

    @Override
    public void dataPack() {
        System.out.println("Using DataPack of Jio!");
    }
}
class Vodafone implements Sim
{
    @Override
    public void calling() {
        System.out.println("Calling via Vodafone Sim!");
    }

    @Override
    public void dataPack() {
        System.out.println("Using DataPack of Vodafone!");
    }
}

public class Interface1
{
    public static void main(String[] args) {
        //we can create object of interface indirectly by using their child class
        System.out.println("Creating object of Airtel Sim");
        Sim airtel = new Airtel();
        airtel.calling();
        airtel.dataPack();
        System.out.println("Creaying Object of Jio Sim");
        Sim jio = new Jio();
        jio.calling();
        jio.dataPack();
        System.out.println("Creating object of Vodafone Sim");
        Sim vodafone = new Vodafone();
        vodafone.calling();
        vodafone.dataPack();
    }
}

/*
  OUTPUT:
  /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface1
Creating object of Airtel Sim
Calling by using Airtel Sim!
Using Data Pack of Airtel
Creaying Object of Jio Sim
Calling via Jio Sim!
Using DataPack of Jio!
Creating object of Vodafone Sim
Calling via Vodafone Sim!
Using DataPack of Vodafone!

Process finished with exit code 0

 */