package Øvelse;

public class Calculate {
    double nr1;
    double nr2;

    public double getOperations(double nr1, double nr2, String op) {
        this.nr1 =nr1;
        this.nr2 = nr2;

        switch (op) {
            case "add":
                return nr1+nr2;

            case "minus":
                return nr1-nr2;

            case "gange":
                return nr1*nr2;

            case "dividere":
                return nr1/nr2;
            default:
                System.out.println("Invalid, try again!");
        }
        return 0.0;
    }

    public static void main(String[] args) {
        Calculate c = new Calculate();
        System.out.println(c.getOperations(12,5, "minus"));
        double hej = c.calculateSqr(5,6);
        System.out.println(hej);
    }

    public double calculateSqr(double number1, double number2) {
        return Math.sqrt(number1*number2);
    }
}
