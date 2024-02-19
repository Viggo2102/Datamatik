package Øvelse;

import java.util.ArrayList;

public class CoinØvelse {
}

class Coin3{
    int value;
    double weightInGrams;
Coin3(int value, double weightInGrams) {
    this.value = value;
    this.weightInGrams = weightInGrams;
}
}

class Wallet3 {
    ArrayList<Coin3> list = new ArrayList<>();
    double totalweight = 0;

    public void addCoin(Coin3 c) {
        if ((c.weightInGrams + totalweight) < 1000) {
            list.add(c);
            totalweight += c.weightInGrams;
        }
        else System.out.println("Pungen er for tung");
    }

    public void highestValue() {
        int value = 0;

        for (Coin3 cc: list) {
            if (cc.value> value) {
                value = cc.value;
            }
        }
        if (value<10) System.out.println(" :) ");
        else if (value<=50) System.out.println(" :D ");
        else System.out.println(" :( ");
    }

    public static void main(String[] args) {
        Coin3 c = new Coin3(1,100);
        Coin3 c1 = new Coin3(15,200);
        Coin3 c2 = new Coin3(20,500);
        Coin3 c3 = new Coin3(90,300);

        Wallet3 w = new Wallet3();

        w.addCoin(c);
        w.highestValue();
        w.addCoin(c1);
        w.highestValue();
        w.addCoin(c2);
        w.highestValue();
        w.addCoin(c3);
        w.highestValue();
    }

}

