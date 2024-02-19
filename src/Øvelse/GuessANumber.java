package Øvelse;

import java.util.Scanner;

public class GuessANumber {
    public static void main(String [] Args) {
        Scanner scanner = new Scanner(System.in);
        int randomNr = (int) (Math.random()*100)+1;
        int numberOfGuesses =0;

        while(true) {
            numberOfGuesses++;
            System.out.println("Indtast et nummer mellem 1-100");
            int myGuess = scanner.nextInt();
            if (myGuess < randomNr) {
                System.out.println("For lavt, prøv igen");
            } else if (myGuess>randomNr) {
                System.out.println("For højt, prøv igen");
            }
            else {
                System.out.println("Du har ramt rigtigt, Tillykke");
            break;
            }
        }
        System.out.println("Forsøg i alt: " + numberOfGuesses);

    }

}
