package EksamensOpgaver;

import java.util.Calendar;

public class Film {
    String titel;
    int udgivelsesaar;
    Producer pro;

    public Film(String titel, int udgivelsesÅr) {
        this.titel = titel;
        this.udgivelsesaar = udgivelsesÅr;

    }
    public Film(String titel) {
        this(titel, Calendar.getInstance().get(Calendar.YEAR));
    }
    public void tilfølProducer(Producer pro) {
        this.pro = pro;
    }
    public String toString() {
        return titel + " " + udgivelsesaar + " " + pro;
    }
}

class Producer {
    String name;

    Producer(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

class Main4{
    public static void main(String[] args) {
        Film f1 = new Film("Dødens gab", 1889);
        Film f2 = new Film("Dune");
        Producer p = new Producer("Steven Spielberg");
        Producer p1 = new Producer("Denis Vilenueve");

        System.out.println(f1);
        f2.tilfølProducer(p);
        System.out.println(f2);
        f2.tilfølProducer(p1);
        System.out.println(f2);
    }
}
