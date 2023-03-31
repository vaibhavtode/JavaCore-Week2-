package Oops;

//Program for Hierarchial Inheritance
class Grandmother
{
    void gold()
    {
        System.out.println("GrandMother's Gold");
    }
}
class papa extends Grandmother
{
    void RedCar()
    {
        System.out.println("Papa's Red Car");
    }
}
class uncle extends Grandmother
{
    void BlueCar()
    {
        System.out.println("Uncle's Blue car");
    }

}

public class Inheritance3{
    public static void main(String[] args) {
        System.out.println("Hierarchial Inhertiance");
        papa p1 = new papa();
        //papa can access the properties of grandmother but not
        // uncle as there is no relation betwn both.
        p1.gold();
        p1.RedCar();
        //similarly uncle can access the properties of grandmother but not
        // papa as there is no relation betwn both.
        uncle u1 = new uncle();
        u1.BlueCar();
        u1.gold();
        //grandmother cant access its child properties
        Grandmother g1 = new Grandmother();
        g1.gold();
    }
}

/*
   OUTPUT:
   Oops.Inheritance3
    Multilevel Inhertiance
    GrandMother's Gold
    Papa's Red Car
    Uncle's Blue car
    GrandMother's Gold
    GrandMother's Gold

Process finished with exit code 0

 */