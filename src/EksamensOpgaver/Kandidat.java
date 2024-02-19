package EksamensOpgaver;

import java.util.ArrayList;
import java.util.List;

public class Kandidat {
    String name;
    String party;
    int numberOfVotes;

    Kandidat(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String toString() {
        return name + " " + party + " " + numberOfVotes;
    }
}

class Elektion {
    public int getTotalVotes(ArrayList<Kandidat> li) {
        int totalVotes = 0;

        for (Kandidat k : li) {
            totalVotes += k.numberOfVotes;
        }
        return totalVotes;
    }

    public ArrayList<Kandidat> getKandidaterFraParti(ArrayList<Kandidat> l, String party) {
        ArrayList<Kandidat> list = new ArrayList<>();

        for (Kandidat k : l) {
            if (party.equals(k.party)) {
                list.add(k);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Elektion e = new Elektion();
        ArrayList<Kandidat> liste = new ArrayList<>();
        Kandidat k1 = new Kandidat("Mette Frederiksen", "SD", 1000);
        Kandidat k2 = new Kandidat("Troels Lund Poulsen", "V", 500);
        Kandidat k3 = new Kandidat("Jeppe Kofoed", "SD", 200);
        Kandidat k4 = new Kandidat("Lars Løkke", "Moderaterne", 2000);

        liste.add(k1);
        liste.add(k2);
        liste.add(k3);
        liste.add(k4);

        for (Kandidat kk : liste) {
            System.out.println(kk);
        }
        System.out.println(e.getKandidaterFraParti(liste, "SD"));

        System.out.println(e.getTotalVotes(liste));
    }
}
