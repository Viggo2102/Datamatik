package NewØvelse;

import java.util.ArrayList;

public class Bibliotek {
    static ArrayList<Bog> list = new ArrayList<>();
    public static void main(String[] args) {
        Bog b1 = new Bog(212, "The Shining", 1997);
        Bog b2 = new Bog(213, "East of Paradise", 1975);
        Bog b3 = new Bog(214, "1984", 1961);
        Bog b4 = new Bog(214, "1545654", 1961);

        list.add(b1);
        list.add(b2);
        list.add(b3);
        System.out.println(checkISBN(b4));
    }
    public static boolean checkISBN(Bog b) {
        for (Bog bb: list) {
            if (bb.iSBN == b.iSBN) {
                System.out.println("Bogens nr. findes allerede");
                return true;
            }
        }
        return false;
    }
}

