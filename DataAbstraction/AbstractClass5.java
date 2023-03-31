package DataAbstraction;

import java.util.Scanner;

abstract class Shape
{
    abstract void shapeArea();
}
class Circle extends Shape
{
    @Override
    void shapeArea() {
        int r;
        System.out.println("Enter radius: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        System.out.println("Area of Circle is: "+((Math.PI)*r*r));
    }
}
class Rectangle extends Shape
{
    @Override
    void shapeArea() {
        int l,b;
        System.out.println("Enter Length: ");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        System.out.println("Enter Breadth: ");
        b = sc.nextInt();
        System.out.println("Area of Rectangle is: "+(l * b));
    }
}
class Square extends Shape
{
    @Override
    void shapeArea() {
        int s;
        System.out.println("Enter side: ");
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        System.out.println("Area of Square is: "+ (s * s));
    }
}
public class AbstractClass5
{
    public static void main(String[] args) {
        //creating the object of Shape indirectly through its child
        Shape s1 = new Circle();
        s1.shapeArea(); //Area of circle
        Shape s2 = new Rectangle();
        s2.shapeArea();//Area of Rectangle
        Shape s3 = new Square();
        s3.shapeArea(); //Area of Square
    }
}

/*
    Output:-
    DataAbstraction.AbstractClass5
Enter radius:
2
Area of Circle is: 12.566370614359172
Enter Length:
10
Enter Breadth:
2
Area of Rectangle is: 20
Enter side:
5
Area of Square is: 25

Process finished with exit code 0

 */