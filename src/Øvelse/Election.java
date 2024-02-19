/*package Øvelse;

import java.io.*;
import java.util.ArrayList;

public class Election {
    ArrayList<Candidate> c1 = new ArrayList<>();

    public int getTotalVotes(ArrayList<Candidate> c1) {
        int totalVotes = 0;
        for (Candidate l : c1) {
            totalVotes = l.numberOfVotes + totalVotes;
        }
        return totalVotes;
    }

    public ArrayList<Candidate> getCandidatesFromParty(ArrayList<Candidate> g, String party) {
        ArrayList<Candidate> p1 = new ArrayList<>();
        for (Candidate l : g) {
            if (l.party.matches(party)) {
                p1.add(l);
            }

        }
        return p1;
    }

    public static void main(String[] args) throws IOException {
        Election e1 = new Election();
        Candidate t1 = new Candidate("Boge", "Venstre", 10);
        Candidate t2 = new Candidate("Biger", "Venstre", 52);
        Candidate t3 = new Candidate("Jytte", "Socialdemokraterne", 40);
        Candidate t4 = new Candidate("Mette", "Socialdemokraterne", 19);
        e1.c1.add(t1);
        e1.c1.add(t2);
        e1.c1.add(t3);
        e1.c1.add(t4);
        ArrayList<Candidate> nyCandidatListe = new ArrayList<>();
        nyCandidatListe = e1.getCandidatesFromParty(e1.c1, "Venstre");
        BufferedWriter bw = new BufferedWriter(new FileWriter("VenstreCandidater.txt"));
        for (Candidate l : nyCandidatListe) {
            bw.write("Candidate name: " + l.name + " Total votes: " + l.numberOfVotes + "\n");
        }
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("VenstreCandidater.txt"));
        String l;
        while ((l = br.readLine()) != null) {
            System.out.println(l);
        }
        br.close();
    }
}*/
