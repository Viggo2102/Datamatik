package AndenSemester.Øvelse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,6,4,9,7,0,7,4,21,12,45,76,8));

        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()) {
            int numbers = itr.next();
            if (numbers % 2!=0) { //removes odd numbers. == removes even numbers.
                itr.remove();
            }
        }
        System.out.println(list);

        List<String> newList = new ArrayList<>(List.of("Bob", "Dylan", "Joe", "Kim", "Jimi"));

        Iterator<String> iteraator = newList.iterator();
        while (iteraator.hasNext()) {
            String name = iteraator.next();
            if (name.equals("Bob")) {
                iteraator.remove();
            }
        }
        System.out.println(newList);
    }

}
