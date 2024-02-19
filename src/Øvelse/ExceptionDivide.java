    package Øvelse;

    public class ExceptionDivide {

        public double divideNumbers(double e, double a) {
            if (e == 0 || a == 0) {
                throw new ArithmeticException("Ikke dividere med 0 fyr");
            }
                return e / a;
        }

        public static void main(String[] args) {
            ExceptionDivide ex = new ExceptionDivide();
            try {
                System.out.println(ex.divideNumbers(5,20));
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }
