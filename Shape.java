import java.util.Scanner;
abstract class Shape {
    int a, b;
    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract void printArea();
}
class Rectangle extends Shape {
    Rectangle(int l, int b) {
        super(l, b);
    }
    void printArea() {
        System.out.println("Area of Rectangle = " + (a * b));
    }
}
class Triangle extends Shape {
    Triangle(int base, int height) {
        super(base, height);
    }
    void printArea() {
        System.out.println("Area of Triangle = " + (a * b) / 2.0);
    }
}
class Circle extends Shape {
    Circle(int r) {
        super(r, 0);
    }
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * a * a));
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Shape: ");
        String shape = sc.next();
        Shape s;
        if (shape.equalsIgnoreCase("Rectangle")) {
            System.out.print("Length: ");
            int l = sc.nextInt();
            System.out.print("Breadth: ");
            int b = sc.nextInt();
            s = new Rectangle(l, b);
            s.printArea();
        } else if (shape.equalsIgnoreCase("Triangle")) {
            System.out.print("Base: ");
            int base = sc.nextInt();
            System.out.print("Height: ");
            int h = sc.nextInt();
            s = new Triangle(base, h);
            s.printArea();
        } else if (shape.equalsIgnoreCase("Circle")) {
            System.out.print("Radius: ");
            int r = sc.nextInt();
            s = new Circle(r);
            s.printArea();
        } else {
            System.out.println("Invalid Shape");
        }
        sc.close();
    }
}
