package Oops;
//Program for Encapsulation
class Person
{

    private String name;
    private int age;

    //Now we Generate Getter and Setters

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
public class Encapsulation1
{
    public static void main(String[] args) {
        System.out.println("--------------ENCAPSULATION-------------");
        Person person = new Person();
        person.setName("Babuji");
        person.setAge(99);
        System.out.println("Name is : "+ person.getName());
        System.out.println("Age is :"+person.getAge());
        System.out.println("Babuji Jara Dheere Chalo !!!");
    }
}

/*
    OUTPUT:-
        /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore Oops.Encapsulation1
        --------------ENCAPSULATION-------------
        Name is : Babuji
        Age is :99
        Babuji Jara Dheere Chalo !!!

        Process finished with exit code 0
 */