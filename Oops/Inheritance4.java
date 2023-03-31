package Oops;

class Animal
{
    void Speak()
    {
        System.out.println("Animal is Speaking");

    }

}
class Dog extends Animal
{
    @Override
    void Speak() {
        super.Speak();

    }
    void bark()
    {
        System.out.println("Dog is Barking");
    }
}
class Puppy extends Dog
{
    void eat()
    {
        System.out.println("Puppy Eats Pedigree");
    }
}

public class Inheritance4
{
    public static void main(String[] args) {
        //Creating object
        Dog dog = new Dog();
        dog.Speak();
        dog.bark();
        Puppy puppy = new Puppy();
        puppy.Speak();
        puppy.eat();
        puppy.bark();
    }
}

/*
OUTPUT:-
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore Oops.Inheritance4
        Animal is Speaking
        Dog is Barking
        Animal is Speaking
        Puppy Eats Pedigree
        Dog is Barking
*/