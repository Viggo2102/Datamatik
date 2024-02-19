package NewØvelse;

public class Bog {
    int iSBN;
    String titel;
    int udgivelsesår;

    Bog(int iSBN, String titel, int udgivelsesår) {
        this.iSBN = iSBN;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public String toString() {
        return "ISBN number: " + iSBN + "Titel: " + "Udgivelsesår: " + udgivelsesår;
    }

    public void setiSBN(int iSBN) {
        this.iSBN = iSBN;
    }
    public int getiSBN() {
        return iSBN;
    }

}
