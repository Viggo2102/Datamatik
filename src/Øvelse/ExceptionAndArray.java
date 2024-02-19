package Øvelse;

public class ExceptionAndArray {

    public double calculateAverage(int[] numbers) {

        try {
            if (numbers.length == 0) {
                throw new ArithmeticException("Cannot");
            }

            for (int number : numbers) {
                if (number < 0) {
                    throw new ArrayIndexOutOfBoundsException("Nej");
                }
            }

            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }

            return (double) sum / numbers.length;

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer found int he array");
        }
        return 0.0;
    }

    public static void main(String[] args) {
        ExceptionAndArray e = new ExceptionAndArray();
        try {
            int[] numbers = {10, 20, 30, -5};
            for (int n : numbers) {
                System.out.println(n);
                throw new Exception("Det ok");
            }

            double average = e.calculateAverage(numbers);

            if (average != 0) {
                System.out.println("Avergae " + average);
            }
        } catch (Exception f) {
            System.out.println(f.getMessage());
        }
    }
}
