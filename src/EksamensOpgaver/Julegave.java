package EksamensOpgaver;

import java.util.Random;

public class Julegave {
    Random gen = new Random();
    boolean isSoft;
    boolean isRectangular;
    boolean doesRattle;

    Julegave() {
    isSoft = gen.nextBoolean();
    isRectangular = gen.nextBoolean();
    doesRattle = gen.nextBoolean();
    }

    //Man kan også bruge denne metode, og så sætte instansvariablerne ovenover så de = setRandom.
    public boolean setRandom() {
       return gen.nextBoolean();
    }


    public boolean couldBeLego() {
        return isSoft && isRectangular && doesRattle;
    }

    public static void main(String[] args) {
        Julegave j = new Julegave();
        System.out.println(j.doesRattle);
        System.out.println(j.isSoft);
        System.out.println(j.isRectangular);
        System.out.println(j.couldBeLego());
    }

}
