package RegesBogØvelser2.sem;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercises3 {

    public static void main(String[] args) {
        List<Integer> listmy = new LinkedList<>(List.of(0, 0, 2, 0, 4, 6, 6, 0, 8, 6, 10, 0, 12, 0, 14, 0, 16));
        System.out.println("Original liste: " +listmy);

        removeInRange(listmy, 0, 5, 13);

        System.out.println("Rettet liste: " + listmy);

    }
    public static void removeInRange (List<Integer> list, int value, int min, int max) {
        ListIterator<Integer> itr = list.listIterator();

        int currentIndex = 0;

        while (itr.hasNext()) {
            int current = itr.next();
            if (current == value && currentIndex >= min && currentIndex <= max) {
                itr.remove();
            }
            currentIndex++;
        }
    }
}
