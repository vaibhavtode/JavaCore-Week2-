package DataAbstraction;

abstract class Sim1
{
    abstract void calling();
    abstract void dataPack();
}

class Airtel1 extends Sim1
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
class Jio1 extends Sim1
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
class Vodafone1 extends Sim1
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

public class AbstractClass4
{
    public static void main(String[] args) {

        System.out.println("---------ABSTRACTION USING ABSTRACT CLASS---------------");
        //we can create object of interface indirectly by using their child class
        System.out.println("Creating object of Airtel Sim");
        Sim1 airtel1 = new Airtel1();
        airtel1.calling();
        airtel1.dataPack();
        System.out.println("Creaying Object of Jio Sim");
        Sim1 jio1 = new Jio1();
        jio1.calling();
        jio1.dataPack();
        System.out.println("Creating object of Vodafone Sim");
        Sim1 vodafone1 = new Vodafone1();
        vodafone1.calling();
        vodafone1.dataPack();
    }
}

/*
  OUTPUT:
  /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface1
---------ABSTRACTION USING ABSTRACT CLASS---------------
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