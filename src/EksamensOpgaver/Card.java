package EksamensOpgaver;

public class Card {
    String suit;
    int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int suitValue() {
        if (this.suit == "Clubs") return 1;
        if (this.suit == "Diamonds") return 2;
        if (this.suit == "Hearts") return 3;
        if (this.suit == "Spades") return 4;
    return 0;
    }

    public String beats(Card c2) {
        if (this.value < c2.value && this.suit == c2.suit) {
            return "Card 2 wins";
        } else if (this.value > c2.value && this.suit == c2.suit) {
            return "Card 1 wins";
        }
        else if (this.suitValue()<c2.suitValue()) {
            return "Card 2 wins";
        }
        else return "Card 1 wins";
    }

    public static void main(String[] args) {
        Card c1 = new Card("Diamonds", 7);
        Card c2 = new Card("Spades", 8);
        System.out.println(c1.beats(c2));
    }
}
