package Øvelse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ant implements Comparable<Ant> {
    double topSpeed;

    Ant (double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return topSpeed + "";
    }

    public int compareTo(Ant o) {
        return Double.compare(this.topSpeed, o.topSpeed);
    }

    public Ant getFastesAnt(ArrayList<Ant> ants) {
        Ant fastestAnt = ants.get(0);
        for (Ant a: ants) {
            if (a.topSpeed> fastestAnt.topSpeed) {
                fastestAnt =a;
            }
        }
        System.out.println("Den hurtigste myre: " + fastestAnt);
        return fastestAnt;
    }
}

class Anthill {
    ArrayList<Ant> anthill = new ArrayList<>();

    public void addAnt(Ant ant) {
        anthill.add(ant);
    }

}
class AntMain {
    public static void main(String[] args) {
        Anthill a = new Anthill();
        Ant e = new Ant(5000);
        Ant f = new Ant(50);
        Ant g = new Ant(500);
        a.addAnt(e);
        a.addAnt(f);
        a.addAnt(g);
        System.out.println(a.anthill);
        Collections.sort(a.anthill);
        //a.anthill.sort(null); Begge metoder virker.
        System.out.println(a.anthill);

        for (int i =0; i<10; i++) {
            a.anthill.add(new Ant(800+i));
        }
        System.out.println(a.anthill);
        e.getFastesAnt(a.anthill);
    }
}
