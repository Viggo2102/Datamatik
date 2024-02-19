package Øvelse;

import java.util.ArrayList;

public class Artikel {
    String heading;
    String body;
    String author;

    Artikel(String heading, String body, String author) {
        this.heading = heading;
        this.body = body;
        this.author = author;
    }
    public String toString() {
        return heading + " " + body + " " + author;
    }

    public String getLongestWord() {
        String longestWord = "";
        String[] words = body.split(" ");
        for (int i = 0; i<words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public ArrayList<String> getWords() {
        ArrayList<String> resultat = new ArrayList<>();
        String[] ord = body.split(" ");
        for (int i = 0; i<ord.length; i++) {
            if(!resultat.contains(ord[i])) {
                resultat.add(ord[i]);
            }
        }
        return resultat;
    }
}

class Main5 {
    public static void main(String[] args) {
        Artikel a = new Artikel("Du gætter aldig hvad han gjorde efter","JEg gik en mega fantastisk lang tur her den anden dag, og jeg blev bare så glad af det." , "Viktor Rasmussen");
        System.out.println(a);
        String longesWord = a.getLongestWord();
        System.out.println(longesWord);
        ArrayList<String> unikkeOrd = a.getWords();
        System.out.println(unikkeOrd);
    }
}
