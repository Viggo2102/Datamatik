package NewØvelse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Partitionss {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(List.of(0,5,12,-1,-5,15,12,7,5,8,-1,0,9));
        System.out.println(list);
        partitionss(list, 10);
        System.out.println(list);
    }

    public static void partitionss(List<Integer> list, int E) {
        Iterator<Integer> itr = list.iterator();
    List<Integer> lowerThanE = new LinkedList<>();
    List<Integer> greaterThanE = new LinkedList<>();

    while (itr.hasNext()) {
        int num = itr.next();
        if (num<E) {
            lowerThanE.add(num);
            itr.remove();

        } else if (num>E) {
            greaterThanE.add(num);
            itr.remove();
        }
    }

    /*for (int hej: list) {
        if (hej<E) {
            lowerThanE.add(hej);
        }
        else {
            greaterThanE.add(hej);
        }
    }
    list.clear();*/
    list.addAll(lowerThanE);
    list.addAll(greaterThanE);

}
}
