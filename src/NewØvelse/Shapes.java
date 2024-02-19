package NewØvelse;

import java.util.ArrayList;
import java.util.List;

public interface Shapes {
    public double getAreal();
    public double getPerimeter(); //Omkreds
}

class Triangle implements Shapes {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b =b;
        this.c = c;
    }

    public String toString() {
        return a + " " + b + " " + c;
    }

    public double getAreal() {
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public double getPerimeter() {
        return a+b+c;
    }

    public static void main(String[] args) {
        List<Shapes> list = new ArrayList<>();
        Shapes t = new Triangle(10,12,15);
        list.add(t);

        for (Shapes s: list) {
            System.out.println(s);
            System.out.println(s.getAreal());
            System.out.println(s.getPerimeter());
        }
    }
}
