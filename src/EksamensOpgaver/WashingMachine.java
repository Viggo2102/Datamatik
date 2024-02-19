package EksamensOpgaver;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class WashingMachine {
    int temperature;
    boolean isExpressWash;
    LocalDate localDate;

    public int start(boolean isExpressWash, int temperature) {
        this.isExpressWash = isExpressWash;
        this.temperature = temperature;
        int tid;

        if (isExpressWash){
            return 20;
        }

        if(temperature == 30 || temperature == 40){
          return  90;

        }
        if( temperature == 60 || temperature == 90){
            return tid = 120;

        }
        return tid = 0;
    }

    public void logging(){
        log l1 = new log();
        Scanner scan = new Scanner(System.in);
        localDate = LocalDate.now();


    }

    public static void main(String[] args) {
        WashingMachine w = new WashingMachine();
        System.out.println(w.start(true,90));
    }

}

class log{
    ArrayList<WashingMachine> list = new ArrayList<>();
}
