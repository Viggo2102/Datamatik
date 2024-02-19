package LottoOpgave;

import java.util.*;

public class Lotto {
    ArrayList<Integer> list = new ArrayList<>();
    Random gen = new Random();
   static Set<Integer> vinderTal = new TreeSet<>();
    Set<Integer> tillægsTal = new TreeSet<>();

    public static void main(String[] args) {
       Lotto l = new Lotto();
        System.out.println(l.getLottoNumbers());

    }


    public ArrayList<Integer> getLottoNumbers() {
        while (vinderTal.size()<5) {
            int tal = gen.nextInt(36)+1;
            vinderTal.add(tal);
        }
        list.addAll(vinderTal);

        while (tillægsTal.size()<2) {
            int tillægs = gen.nextInt(36)+1;
            if (!list.contains(tillægs)) {
                tillægsTal.add(tillægs);
            }
        }
        System.out.println("tillægstal: " + tillægsTal);
        list.addAll(tillægsTal);
        return list;
    }

}
