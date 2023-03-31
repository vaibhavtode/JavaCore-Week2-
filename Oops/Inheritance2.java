package Oops;
//Program for Multilevel Inheritance
class Grandpa
{
    void gold()
    {
        System.out.println("Grand Pa's gold");
    }
}

class Dad extends Grandpa
{
    void Property()
    {
        System.out.println("Father's Property!");
    }
}

class Son1 extends Dad
{
    void Chopper()
    {
        System.out.println("This is Vaibhav's Chopper!!");
    }
}

class Son2 extends Dad  //Here Son1 and Son2 don't have any relation between them
{
    void fatfaty()
    {
        System.out.println("This is Piyush's Property!");
    }
}

public class Inheritance2
{
    public static void main(String[] args) {
        Son1 son = new Son1();
        son.Chopper();//son can access its own property
        son.gold();//son can access his grandfathers property
        son.Property(); //son can access his Dad's property

        Son2 son2 = new Son2();
        son2.fatfaty();//son can access its own property
        son2.gold();//son2 can access its grandpas property
        son2.Property(); //son2 can access his fathers property

        Dad d1 = new Dad();
        //dad can access his property and his fathers(i.e grandpa's property).
        //dad cant access any of the child property and so does grandpa
        d1.Property();
        d1.gold();
    }
}
/*
  OUTPUT:-
  Oops.Inheritance2
This is Vaibhav's Chopper!!
Grand Pa's gold
Father's Property!
This is Piyush's Property!
Grand Pa's gold
Father's Property!
Father's Property!
Grand Pa's gold

Process finished with exit code 0

 */