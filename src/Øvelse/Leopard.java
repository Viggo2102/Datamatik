package Øvelse;

import java.util.ArrayList;
import java.util.Collections;

public class Leopard implements Comparable<Leopard> {
    double topSpeed;

    Leopard(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public String toString() {
        return "Topspeed: " + topSpeed;
    }

    public Leopard getFastestLeopard(ArrayList<Leopard> l) {
        Leopard fastestLeopard = l.getFirst();

        for (Leopard ll: l) {
            if (ll.topSpeed>fastestLeopard.topSpeed) {
                fastestLeopard = ll;
            }
        }
        return fastestLeopard;
    }

    public static void addLeopard(ArrayList<Leopard> l, double topSpeed) {
        Leopard newLeopard = new Leopard(topSpeed);
        l.add(newLeopard);
        System.out.println("Ny leopard added: " + newLeopard);
    }

    public int compareTo(Leopard o) {
        return Double.compare(topSpeed, o.topSpeed);
    }

    public static void main(String[] args) {
        Leopard ll = new Leopard(0);
        ArrayList<Leopard> list = new ArrayList<>();
        Leopard l1 = new Leopard(150);
        Leopard l3 = new Leopard(200);
        Leopard l2 = new Leopard(1200);
        Leopard l4 = new Leopard(1300);
        addLeopard(list, 150);

        list.add(l1);
        list.add(l2);
        list.add(l3);
        list.add(l4);

        for (Leopard l: list) {
            System.out.println(l);
        }
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Hurtigste leopard: " + ll.getFastestLeopard(list));

    }

}
