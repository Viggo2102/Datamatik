import java.util.Scanner;

 class Maina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indtast den nuværende højde af græsset (i cm): ");
        double currentHeight = scanner.nextDouble();

        System.out.print("Indtast den tilladte højde for slåning (i cm): ");
        double maxHeight = scanner.nextDouble();

        int daysUntilMowing = calculateDaysUntilMowing(currentHeight, maxHeight);
        System.out.println("Antal dage indtil næste slåning: " + daysUntilMowing + " dage");

        scanner.close();
    }

    public static int calculateDaysUntilMowing(double currentHeight, double maxHeight) {
        double grassGrowthRate = 0.8; // cm per dag
        double heightDifference = maxHeight - currentHeight;
        int daysUntilMowing = (int) Math.ceil(heightDifference / grassGrowthRate);
        return daysUntilMowing;
    }
}

public class Grass {
}
