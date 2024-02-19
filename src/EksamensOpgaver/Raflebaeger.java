package EksamensOpgaver;

import java.util.Random;

public class Raflebaeger {
    Random gen = new Random();
    //Terning t = new Terning();
    int antalTerninger;

    Raflebaeger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
        }

        public int kast() {
        return gen.nextInt(6)+1;
        }

        public int ryst() {
        int samletøjne = 0;
        for (int i = 0; i<antalTerninger; i++) {
            samletøjne +=kast();
        }
        //Random generator = new Random();
         //int samletøjne = generator.nextInt(6)+1 + antalTerninger;
        //int samletAntalØjne = t.kast() + antalTerninger;
        //t.kast();
        return samletøjne;
        }

    public static void main(String[] args) {
        Raflebaeger r = new Raflebaeger(4);
        System.out.println(r.ryst());
        for (int i = 0; i< r.antalTerninger; i++) {
            int eyes = r.kast();
            System.out.println("Die " + (i+1) + ": " + eyes);

        }
    }
    }

    /*class Terning {
    Random gen = new Random();

    public int kast() {
        return gen.nextInt(6)+1;
    }
}*/

