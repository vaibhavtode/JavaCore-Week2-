package Oops;

//CompileTime Polymorphism :
//here we use Method Overloading
public class Polymorphism1
{
    void show(String i)
    {
        System.out.println("Heyy,"+i);
    }

    void show(int a)
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Polymorphism1 poly = new Polymorphism1();
        poly.show(22);
        poly.show("vaibhav");
    }
}
