package RegesBogØvelser2.sem;

import java.util.*;

public class Opgave5 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(1,5,7,6,9,1,2,3,5,7,9,9,9,7,5,4));
        System.out.println("List before sorting and arranging: " + l);

        sortAndRemoveDuplicates(l);
        System.out.println("Afgter sorting and arranging: " + l);

    }


    public static void sortAndRemoveDuplicates(List<Integer> list) {

        //Collections.sort(list); // Kun nødvendig hvis det er LinkedHashSet.

        //Set<Integer> unique = new LinkedHashSet<>(list);

        //Set<Integer> unique = new TreeSet<>(Comparator.reverseOrder()); Sorterer fra største til mindste.
        //unique.addAll(list);

        Set<Integer> unique = new TreeSet<>(list);


        list.clear();
        list.addAll(unique);


    }


}
