package Øvelse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStreamExample {
    public static void main(String[] args) {
        // Creating an ArrayList of integers
        List<Integer> numbersList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Converting the ArrayList to a stream and squaring each element
        List<Integer> squaredNumbers = numbersList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        // Print the squared numbers
        System.out.println(squaredNumbers);
    }
}

