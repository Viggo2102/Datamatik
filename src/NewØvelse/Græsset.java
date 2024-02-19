package NewØvelse;

import java.util.Arrays;
import java.util.Scanner;

public class Græsset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Skriv hvor højt græsset er: ");
        double grassLengthh = scanner.nextDouble();

        System.out.println("Skriv hbvor højt græsset må være: ");
        double maxLengthh = scanner.nextDouble();

        System.out.println(daysUntilMowing(grassLengthh, maxLengthh));


    }

    public static double daysUntilMowing(double grassLength, double maxLength) {
        double grassGrowth = 0.8;
        //double antalDage = 0;
        double heightDifference = maxLength-grassLength;
        double dage = heightDifference/grassGrowth;
        if (dage<=0) {
            System.out.println("Klip græsset nu ven");
        }

        /*for (double days = maxLength; grassLength<days; grassLength+=grassGrowth ) {
            antalDage++;
        }*/
        //return antalDage;
        return  dage;
    }

}
