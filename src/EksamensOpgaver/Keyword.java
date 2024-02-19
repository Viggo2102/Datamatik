package EksamensOpgaver;

import java.util.ArrayList;

/*public class Keyword {
    String word;
    String definition;

    public boolean matches(String searchWord) {
        if (word.equals(definition)) {
            return true;
        }
        return false;
    }
}*/
import java.util.ArrayList;
/*import java.util.List;

class Keyword {
    private String word;
    private String definition;
    private List<Keyword> seeAlso;

    public Keyword(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.seeAlso = new ArrayList<>();
    }

    public boolean matches(String searchWord) {
        // Check if the given search word matches the keyword's word
        return searchWord.toLowerCase().equals(word.toLowerCase());
    }

    public void addSeeAlso(Keyword otherKeyword) {
        // Add another keyword to the "see also" attribute
        seeAlso.add(otherKeyword);
    }

    public void printSeeAlso() {
        // Print "see also" references for this keyword
        System.out.println("See also for " + word + ":");
        for (Keyword otherKeyword : seeAlso) {
            System.out.println("- " + otherKeyword.word + ": " + otherKeyword.definition);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Create some Keyword objects
        Keyword pythonKeyword = new Keyword("Python", "A programming language");
        Keyword javaKeyword = new Keyword("Java", "Another programming language");
        Keyword cppKeyword = new Keyword("C++", "Yet another programming language");

        // Add "see also" references between some keywords
        pythonKeyword.addSeeAlso(javaKeyword);
        javaKeyword.addSeeAlso(cppKeyword);

        // Test if a word matches a keyword
        String searchWord = "python";
        if (pythonKeyword.matches(searchWord)) {
            System.out.println(searchWord + " found! Definition: " + pythonKeyword.definition);
        } else {
            System.out.println(searchWord + " not found!");
        }

        // Print "see also" references for a keyword
        pythonKeyword.printSeeAlso();
    }
}*/
import java.util.ArrayList;

public class Keyword {
    String word;
    String defenition;
    ArrayList<String> seeAlso = new ArrayList<>();

    Keyword(String word, String defenition){
        this.word = word;
        this.defenition = defenition;
    }

    public boolean matches(String soegeord){
        if(word.equalsIgnoreCase(soegeord)){
            System.out.println("true");
            return true;
        }
        else for(String l : seeAlso){
            System.out.println(l);
        } return false;

    }

    public static void main(String[] args) {
        Keyword hej = new Keyword("Hej", "Hilsen");
        hej.seeAlso.add("Hello");
        hej.seeAlso.add("Farvel");
        hej.seeAlso.add("Nej tak");

        //hej.matches("hi");
        System.out.println();
        hej.matches("Hej");


    }
}


