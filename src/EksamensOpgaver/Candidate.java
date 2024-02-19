package EksamensOpgaver;

import java.util.ArrayList;

public class Candidate {
    String name;
    String party;
    int numberOfVotes;

    public Candidate(String name, String party, int numberOfVotes) {

        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    public String toString() {
        return name + " " + party + " " + numberOfVotes;
    }

}
class Election {
    ArrayList<Candidate> list = new ArrayList();

    public int getTotalVotes() {
        int totalVotes = 0;

        for (Candidate cc: list) {
            totalVotes += cc.numberOfVotes;
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(String party) {
        ArrayList<Candidate> candidatesFromParty = new ArrayList<>();

        for (Candidate candidates: list) {
            if (candidates.party.equals(party)) {
                candidatesFromParty.add(candidates);
            }
        }
        return candidatesFromParty;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Candidate> candid = new ArrayList<>();
        Election e = new Election();
        Candidate c1 = new Candidate("Lars Løkke", "Moderaterne", 25);
        Candidate c2 = new Candidate("Jakob Schmidt", "Moderaterne", 50);
        Candidate c3 = new Candidate("Pia Olsen Dyhr", "SF", 250);
        candid.add(c1);
        candid.add(c2);
        candid.add(c3);
        for (Candidate c: candid) {
            System.out.println(c);
        }
        System.out.println(e.getTotalVotes());

        e.getCandidatesFromParty("Moderaterne");
        System.out.println(candid);
    }
}



