package AndenSemester.Øvelse;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap();
        empIds.put("John", 244);
        empIds.put("Eric", 4564);
        empIds.put("Alberta", 9087);
        System.out.println(empIds);
        System.out.println();
        System.out.println(empIds.get("Eric"));

        System.out.println(empIds.containsKey("John"));
        System.out.println(empIds.containsValue(5));

        Map<String, Integer> grades = new HashMap<>();

        grades.put("Lisa", 7);
        grades.put("Mads", 10);
        grades.put("Tjaller", 4);
        grades.put("Peter", 7);
        grades.put("Kimmi", 12);

        System.out.println(grades.get("Mads"));
        System.out.println(grades.containsKey("Peter"));
        System.out.println(grades.containsValue(2));
    }
}
