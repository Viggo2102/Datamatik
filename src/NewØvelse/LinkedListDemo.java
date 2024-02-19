package NewØvelse;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of(new String[]{"a", "bb", "ccc", "dd"}));
        System.out.println(list); // Man kan snyde ldit her, så man ikke behøver at adde til listen x4.

        for (String s: list) {
            System.out.println(s + "th");
        }
        System.out.println();

        for (int i = 0; i<list.size(); i++) {
            System.out.println(list.get(i)+"++");
        }
        Iterator<String> itr = list.iterator();
        String longest =  "";
        while (itr.hasNext()) {
            String current = itr.next();
            if (current.length()>longest.length()) {
                longest = current;
            }
        }
        System.out.println();
        System.out.println("Længste ord: " + longest);


            }
        }
