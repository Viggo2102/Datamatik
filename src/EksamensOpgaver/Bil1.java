package EksamensOpgaver;

class Bil1 {
    private Trailer1 trailer;
    int weight;

    public Bil1(int weight) {
        this.weight = weight;

    }

    public int getTotalWeight(Trailer1 t) {
        int totalWeight = weight + t.weight;
        if (totalWeight  <=3500){
            System.out.println("Den er tilkoblet. ");
        }
        else {
            System.out.println("Bilen kan ikke tilkoble traileren. ");
        }return totalWeight;
    }
    public static void main(String[] args) {
        Bil1 bil = new Bil1(2000);
        Trailer1 t1 = new Trailer1(1000);

        System.out.println("Bilen og trailerens totale vægt er " +bil.getTotalWeight(t1));
    }

}
class Trailer1 {
    int weight;

    public Trailer1(int weight) {
        this.weight = weight;
    }

}



