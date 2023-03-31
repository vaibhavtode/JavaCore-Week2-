package DataAbstraction;

import java.util.Scanner;

interface Shape1
{
     void shapeArea1();
}
class Circle1 implements Shape1
{
    @Override
    public void shapeArea1() {
        int r;
        System.out.println("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Area of Circle is: "+((Math.PI)*r*r));
    }
}
class Rectangle1 implements Shape1
{
    @Override
    public void shapeArea1() {
        int l,b;
        System.out.println("Enter Length: ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        System.out.println("Enter Breadth: ");
        b = sc.nextInt();
        System.out.println("Area of Rectangle is: "+(l * b));
    }
}
class Square1 implements Shape1
{
    @Override
    public void shapeArea1() {
        int s;
        System.out.println("Enter side: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        System.out.println("Area of Square is: "+ (s * s));
    }
}
public class Interface4
{
    public static void main(String[] args) {
        //creating the object of Shape indirectly through its child
        Shape1 ss1 = new Circle1();
        ss1.shapeArea1(); //Area of circle
        Shape1 ss2 = new Rectangle1();
        ss2.shapeArea1();//Area of Rectangle
        Shape1 ss3 = new Square1();
        ss3.shapeArea1(); //Area of Square
    }
}

/*
    OUTPUT:
    /home/vaibhav/Desktop/Java-Learnings/JavaCore/out/production/JavaCore DataAbstraction.Interface4
Enter radius:
4
Area of Circle is: 50.26548245743669
Enter Length:
5
Enter Breadth:
5
Area of Rectangle is: 25
Enter side:
6
Area of Square is: 36
Process finished with exit code 0
 */