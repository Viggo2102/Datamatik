package EksamensOpgaver;

import java.util.ArrayList;

public class Bil {
    int vaegt;
    ArrayList<trailer> list = new ArrayList<>();

    public Bil(int vaegt) {
        this.vaegt = vaegt;
    }

    public boolean totalVaegt (trailer t1) {
        System.out.println(vaegt+t1.getVaegt());
        if (this.vaegt + t1.getVaegt() <3500)
            return true;
        else return false;
    }

    public String toString() {
        return vaegt +" ";
    }


}

class trailer {
    int vaegt;

    public trailer(int vaegt) {
        this.vaegt = vaegt;
    }

    public int getVaegt() {
        return vaegt;
    }
    public String toString() {
        return " " + vaegt;
    }
}

class Main3 {
    public static void main(String[] args) {
        Bil b1 = new Bil(1000);
        trailer t1 = new trailer(2000);
        boolean skalTrailerPaa = b1.totalVaegt(t1);
        if (skalTrailerPaa) b1.list.add(t1);
        System.out.println(b1.list);

    }
}
