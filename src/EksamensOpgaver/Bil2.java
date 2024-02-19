package EksamensOpgaver;

public class Bil2 {
    Trailer2 trailer;
    double weight;


    public double getTotalWeight(Trailer2 t) {
        double totalWeight = weight + t.weight;

        if (totalWeight>3500) {
            System.out.println("Du kan ikke koble traileren på, " + weight + "kg");

        } else System.out.println("Traileren er tilkoblet");

        return totalWeight;
    }

    Bil2(double weight) {
        this.weight = weight;

    }

    public static void main(String[] args) {
        Bil2 b = new Bil2(3000);
        Trailer2 tt = new Trailer2(1000);
        b.getTotalWeight(tt);
    }
}

class Trailer2 {
    double weight;

    Trailer2(double weight) {
this.weight = weight;
    }

}
