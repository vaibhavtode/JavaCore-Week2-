package Oops;

class Employee
{
    private String name;
    private int roll;
    private String city;
    private String College;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCollege() {
        return College;
    }

    public void setCollege(String college) {
        College = college;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    private String pin;
}

public class Encapsulation3
{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setName("ABC");
        e1.setRoll(3);
        e1.setCollege("MANIPAL");
        e1.setCity("Hyderabad");
        e1.setPin("123456");
        System.out.println(e1.getName()+ " "+ e1.getRoll()+" "+ e1.getCollege()+" "+ e1.getCity()+" "+ e1.getPin());
    }
}

/*
 OUTPUT:-
 /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore Oops.Encapsulation3
ABC 3 MANIPAL Hyderabad 123456

Process finished with exit code 0
 */