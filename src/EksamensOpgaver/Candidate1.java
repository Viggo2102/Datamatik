package EksamensOpgaver;
import java.util.ArrayList;

public class Candidate1 {
    public Candidate1(String name, String party, int numberOfVotes) {
        this.name = name;
        this.party = party;
        this.numberOfVotes = numberOfVotes;
    }

    String name;
    String party;
    int numberOfVotes;

    @Override
    public String toString() {
        return name +" "+ party +" "+ numberOfVotes;
    }
}

class Election1 {
    static ArrayList<Candidate1> election = new ArrayList<>();

    public static int getTotalVotes(){
        int totalVotes=0;
        for (Candidate1 candidate : election){
            totalVotes+=candidate.numberOfVotes;
        }
        return totalVotes;
    }

    public static ArrayList<Candidate1> getCandidatesFromParty(String party) throws Exception {
        ArrayList<Candidate1> fromParty=new ArrayList<Candidate1>();
        for (Candidate1 candidate : election){
            if (candidate.party.equals(party)) {
                fromParty.add(candidate);
            } else throw new Exception("Fuck af");
        }
        return fromParty;
    }

    public static void main(String[] args) throws Exception {
        try {
            Candidate1 pia = new Candidate1("Pia", "DF", 12);
            Candidate1 pia2 = new Candidate1("Pi1a", "DF", 13);
            Candidate1 pia3 = new Candidate1("Pi1aaaaa", "Moderaterne", 13);
            election.add(pia);
            election.add(pia2);
            election.add(pia3);

            for (Candidate1 cc : election) {
                System.out.println(cc);
            }
            for (Candidate1 c : getCandidatesFromParty("Moderaterne")) {
                System.out.println(c);
            }
            System.out.println(getTotalVotes());
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

