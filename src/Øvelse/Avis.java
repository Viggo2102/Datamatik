package Øvelse;

import java.util.ArrayList;

public class Avis {
    String heading;
    String body;
    String author;

    Avis(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }

    public String getLongestWord() {
        String longestWord = "";
        for (String s : body.split(" ")) {
            if (longestWord.length() < s.length()) {
                longestWord = s;
            }
        }
        return longestWord;
    }
    public ArrayList<String> getWords() {
    ArrayList<String> unikOrd = new ArrayList<>();

        for (String s : body.split(" ")) {
            if (!unikOrd.contains(s)) {
                unikOrd.add(s);
            }
        }
        return unikOrd;
    }

    public static void main(String[] args) {
        Avis avis = new Avis("Ny afsløring! ","Milliardbøde til kæmpe IT virksomhed fra fordi IT var elendig elendig IT", "Viktor R. ");
        System.out.println(avis.getLongestWord());
        System.out.println(avis.getWords());
    }
}
/*
package Øvelse;

import java.util.ArrayList;

public class Avis {
    String heading;
    String body;
    String author;

    Avis(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }
    public String toString() {
        return heading + " " + body + " " + author;
    }

    public String getLongestWord() {
        String longestWord = " ";
        String [] word = body.split(" ");
        for (int i = 0; i<word.length; i++) {
            if (longestWord.length()< word[i].length()) {
                longestWord = word[i];
            }
        }
        return longestWord;
    }

    public ArrayList<String> getWords() {
        ArrayList<String> liste = new ArrayList<>();
        String [] words = body.split(" ");
        for (int i = 0; i< words.length; i++) {
            if(!liste.contains(words[i])) {
                liste.add(words[i]);
            }
        }
        return liste;
    }

    public static void main(String[] args) {
        Avis a = new Avis("Krig på vej!", "Der er en ny krig under opsejling i Danmark, og det er rigtig skidt og det er rigtig skidt", "Viktor R. ");
        System.out.println(a);
        System.out.println(a.getLongestWord());
        System.out.println(a.getWords());

    }
}


 */
