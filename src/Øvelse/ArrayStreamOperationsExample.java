package Øvelse;

import java.util.Arrays;

public class ArrayStreamOperationsExample {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5};
        int sumOfEvens = Arrays.stream(numbers)
                .sum();
        System.out.println(sumOfEvens);

        int [] squaredNumbers = Arrays.stream(numbers)
                .map(n-> n * n )
                .toArray();

        System.out.println(Arrays.toString(squaredNumbers));

        double [] doubles = {1.5, 2.5, 3.7, 4.8, 12.6};
        Arrays.stream(doubles)
                .forEach(number -> System.out.println(number));
    }
}
