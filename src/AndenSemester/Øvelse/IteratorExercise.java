package AndenSemester.Øvelse;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExercise {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10000);
        nums.add(500);
        nums.add(900);

        Iterator<Integer> itr = nums.iterator();

        while (itr.hasNext()) {
            int i = itr.next();
            if (i<900) {
                itr.remove();
            }
        }
        System.out.println(nums);
    }
}
