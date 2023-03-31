package Oops;
//Runtime Polymorphism
//here we use Method overriding
class Car
{
    void run()
    {
        System.out.println("Running.");
    }

}
class Audi extends Car{
    void run()
    {
        System.out.println("Running Swiftly with 100 KM");
    }
}

public class Polymorphism2
{
    public static void main(String[] args) {
        Car b = new Audi();
        b.run();
    }
}

/*
   OUTPUT:
   Oops.Polymorphism2
    Running Swiftly with 100 KM

Process finished with exit code 0
 */