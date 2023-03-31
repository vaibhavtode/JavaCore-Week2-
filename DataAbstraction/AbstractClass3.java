package DataAbstraction;

abstract class Car
{
    abstract void riding();
    abstract void mileage();
    abstract void speed();
}
class Alto extends Car {
    @Override
    void mileage() {
        System.out.println("Alto gives mileage of 24KMPL");
    }

    @Override
    void riding() {
        System.out.println("Alto is Good for Riding for small Family of 4 ");
    }

    @Override
    void speed() {
        System.out.println("Top speed of alto is 140KPH");

    }
}
class I10 extends Car
{
        @Override
        void mileage() {
            System.out.println("I10 gives mileage of 23KMPL");
        }

        @Override
        void riding() {
            System.out.println("I10 is Good for Riding for small Family of 5 ");
        }

        @Override
        void speed() {
            System.out.println("Top speed of I10 is 200KPH");

        }

}
class Creta extends Car {
    @Override
    void mileage() {
        System.out.println("Creta gives mileage of 20KMPL");
    }

    @Override
    void riding() {
        System.out.println("Creta is Good for Riding for MidSize Family of 6");
    }

    @Override
    void speed() {
        System.out.println("Top speed of Creta is 250KPH");

    }
}
public class AbstractClass3
{
    public static void main(String[] args) {
        Car c1 = new Alto();
        c1.mileage();
        c1.riding();
        c1.speed();
        Car c2 = new I10();
        c2.mileage();
        c2.riding();
        c2.speed();
        Car c3 = new Creta();
        c3.mileage();
        c3.riding();
        c3.speed();
    }
}

/*
OUTPUT:
/home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.AbstractClass3
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