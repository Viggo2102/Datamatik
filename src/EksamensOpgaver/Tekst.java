package EksamensOpgaver;

import java.util.ArrayList;

public class Tekst {
    ArrayList<String> tekstLinjer = new ArrayList<>();

    public void tilføj(String t) {
        tekstLinjer.add(t);
    }

    public int findAntalunikke() {
        ArrayList<String> list = new ArrayList<>();

        for (String s: tekstLinjer) {
            if (!list.contains(s)) {
                list.add(s);
            }

        }
        return list.size();
    }

    public static void main(String[] args) {
        Tekst t = new Tekst();
        t.tilføj("Hej med dig jeg hedder Kaj Hej emed dig");
        t.tilføj("Kæft jeg elsker dig");
        t.tilføj("Du er fandme lækker gg");
        int antalUnikke = t.findAntalunikke();
        System.out.println(antalUnikke);
    }
}
