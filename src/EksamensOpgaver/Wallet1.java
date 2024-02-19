package EksamensOpgaver;

import java.util.ArrayList;

public class Wallet1 {

    ArrayList<Coin1> coins = new ArrayList<>();
    double totalWeight = 0;

    void addCoin(Coin1 coin){
        if (coin.weightInGrams+totalWeight<1000) {
            coins.add(coin);
            totalWeight+=coin.weightInGrams;
        } else System.out.println("Pungen er for tung");
        /*if ((coin.weightInGrams+totalWeight)<=1000){
            coins.add(coin);
            totalWeight=totalWeight+coin.weightInGrams;
        }
        else System.out.println("Pungen bliver for tung");*/

    }

     Coin1 highestValue(){
        int value=0;
        int i=0;
        int index=0;
        for (Coin1 c: coins){
            if (c.value>value){
                value= c.value;
                index=i;
            }
            i++;
        }
        if (value<10) System.out.println(":(");
        else if (value<=50) System.out.println(":|");
        else System.out.println(":)");


        return coins.get(index);
    }


    public static void main(String[] args) {
        Coin1 a = new Coin1(1,50);
        Coin1 b = new Coin1(12,20);
        Coin1 c = new Coin1(60,10);
        Coin1 d = new Coin1(1,70);
        Coin1 e = new Coin1(100,1000);

        Wallet1 W = new Wallet1();

        W.addCoin(a);
        W.highestValue();
        W.addCoin(b);
        W.highestValue();
        W.addCoin(c);
        W.highestValue();
        W.addCoin(d);
        W.highestValue();
        W.addCoin(e);
        W.highestValue();
    }

}
class Coin1 {
    int value;
    int weightInGrams;

    Coin1(int value, int weightInGrams) {
        this.value = value;
        this.weightInGrams = weightInGrams;
    }
}