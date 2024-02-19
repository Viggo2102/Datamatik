package Øvelse;

public class LandsholdetArray {
    public static void main(String[] args) {
        Spiller [] hold = new Spiller[3];
        hold [0] = new Spiller("Viktor Rasmussen", 1);
        hold [1] = new Spiller("Lars", 2);
        hold [2] = new Spiller("Jon dahl", 3);
        printOpstilling(hold);
    }

    static void printOpstilling(Spiller [] s) {
        for (int i = 0; i<s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
class Spiller {
    String name;
    int backNumber;

    public Spiller(String name, int backNumber) {
        this.name = name;
        this.backNumber = backNumber;
    }

    @Override
    public String toString() {
        return name + " " + backNumber;
    }
}


