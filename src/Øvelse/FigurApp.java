package Øvelse;

import java.util.ArrayList;

public class FigurApp {
    public static void main(String[] args) {
        Figur f1 = new Rektangel(12,5);
        Figur f2 = new Cirkel(10);
        ArrayList<Figur> list = new ArrayList<>();

        list.add(f1);
        list.add(f2);
        list.add(new Rektangel(13,12));

        for (Figur f: list) {
            System.out.println(f);
            System.out.println(f.beregnAreal() + " " + f.beregnOmkreds());
        }

    }
}

abstract class Figur {
     abstract double beregnOmkreds();
     abstract double beregnAreal();
}

class Cirkel extends Figur {
    double radius;

    Cirkel(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius " + radius;
    }

    double beregnOmkreds() {
        return Math.PI *(radius+radius);
    }
    double beregnAreal() {
        return Math.PI * (radius*radius);
    }
}

class Rektangel extends Figur {
    double height;
    double width;

    Rektangel(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public String toString() {
        return "Height: " + height + "Width: " + width;
    }

    double beregnOmkreds() {
        System.out.println("Rektangels omkreds ");
        return 2 * (height + width);
    }

    double beregnAreal() {
        return height * width;
    }
}


