package Øvelse;

import java.util.ArrayList;

public class AbstractClass {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Shape c = new Circle("Blue", 5);
        Shape r = new Rectangle("Red", 12, 10);
        shapes.add(new Circle("green", 10));

        shapes.add(c);
        shapes.add(r);

        for (Shape s: shapes) {
            System.out.println(s);
            s.calculateArea();
        }

    }
}

abstract class Shape {
    String colour;

    Shape(String colour) {
        this.colour = colour;
    }

    public abstract void calculateArea();
}


class Circle extends Shape {
    double radius;

    Circle(String colour, double radius) {
        super(colour);
        this.radius = radius;
    }
    public void calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Arealet: " + area);
    }

    public String toString() {
        return "Circle: " + colour + " " + radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String colour, double length, double width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    public void calculateArea() {
        double area = length*width;
        System.out.println("arealet af Rektangel: " + area);
    }

    public String toString() {
        return "Rektangel: " + colour + " " + length + " " + width;
    }

}
