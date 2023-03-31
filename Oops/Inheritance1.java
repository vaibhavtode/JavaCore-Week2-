package Oops;
//Program for Single Inheritance
class Father
{
    String name = "Vaibhav's Father";
    void property()
    {
        System.out.println("This is Fathers Property");
    }

}

class Son extends Father
{
    String colour = "fair";
    void car()
    {
        System.out.println("Son's Property");
    }
}

public class Inheritance1{
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.property(); //child is able to access its parent property
        s1.car();
        System.out.println(s1.name);
        System.out.println(s1.colour);

        Father f1 = new Father();
        //father cannot access child properties but only can access its pwn properties
        f1.property();
        System.out.println(f1.name);
    }
}


/* OUTPUT:-
This is Fathers Property
Son's Property
Vaibhav's Father
fair
This is Fathers Property
Vaibhav's Father

Process finished with exit code 0
 */