package DataAbstraction;

interface Carr
{
    void riding();
    void mileage();
    void speed();
}
class Altoo implements Carr {
    @Override
    public void mileage() {
        System.out.println("Alto gives mileage of 24KMPL");
    }

    @Override
    public void riding() {
        System.out.println("Alto is Good for Riding for small Family of 4 ");
    }

    @Override
    public void speed() {
        System.out.println("Top speed of alto is 140KPH");

    }
}
class I_10 implements Carr
{
    @Override
    public void mileage() {
        System.out.println("I10 gives mileage of 23KMPL");
    }

    @Override
    public void riding() {
        System.out.println("I10 is Good for Riding for small Family of 5 ");
    }

    @Override
    public void speed() {
        System.out.println("Top speed of I10 is 200KPH");

    }

}
class Cretaa implements Carr {
    @Override
    public void mileage() {
        System.out.println("Creta gives mileage of 20KMPL");
    }

    @Override
    public void riding() {
        System.out.println("Creta is Good for Riding for MidSize Family of 6");
    }

    @Override
    public void speed() {
        System.out.println("Top speed of Creta is 250KPH");

    }
}
public class Interface5
{
    public static void main(String[] args) {
        Carr c1 = new Altoo();
        c1.mileage();
        c1.riding();
        c1.speed();
        Carr c2 = new I_10();
        c2.mileage();
        c2.riding();
        c2.speed();
        Carr c3 = new Cretaa();
        c3.mileage();
        c3.riding();
        c3.speed();
    }
}

/*
OUTPUT:
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface5
Alto gives mileage of 24KMPL
Alto is Good for Riding for small Family of 4
Top speed of alto is 140KPH
I10 gives mileage of 23KMPL
I10 is Good for Riding for small Family of 5
Top speed of I10 is 200KPH
Creta gives mileage of 20KMPL
Creta is Good for Riding for MidSize Family of 6
Top speed of Creta is 250KPH
 */
