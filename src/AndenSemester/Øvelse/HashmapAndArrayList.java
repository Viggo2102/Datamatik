package AndenSemester.Øvelse;

import java.util.*;

public class HashmapAndArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Charlie", "Marie", "Liva"));

        Map<String, Integer> map = new HashMap<>(Map.of("Charlie", 12, "Marie", 15, "Liva", 13));

        for (String s: list) {
            int grade = map.get(s);
            System.out.println(s + ": " + grade);
        }

        Collections.sort(list);
        for (String ss: list) {
            int newGrade = map.get(ss);
            System.out.println(ss + ": " + newGrade);
        }
    }

}
