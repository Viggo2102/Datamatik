package EksamensOpgaver;
    import java.util.ArrayList;
import java.util.List;

    public class Keyword1 {
        String word;
        String definition;

        public Keyword1(String word, String definition) {
            this.word = word;
            this.definition = definition;
        }
        public boolean matches (String searchWord) {
            return this.word.equalsIgnoreCase(searchWord);
        }

        public static void main(String[] args) {
            Keyword javaKeyword = new Keyword("Java", "A programming language");
            System.out.println("Matches 'java': " + javaKeyword.matches("java"));
            System.out.println("Matches 'Python': " + javaKeyword.matches("Python"));

        }
    }
