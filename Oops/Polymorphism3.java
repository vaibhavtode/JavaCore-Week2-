package Oops;
//Program for Runtime Polymorphism
//here we use Method Overriding
class Papa2
{
    void drink()
    {
        System.out.println("Water");
    }

}
class Son3 extends Papa2
{
    void drink()
    {
        System.out.println("Coffee");
    }
}

public class Polymorphism3
{
    public static void main(String[] args) {
        Son3 s3 = new Son3();
        s3.drink();
    }
}

/*
  OUTPUT:-
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore Oops.Polymorphism3
Coffee

Process finished with exit code 0
 */