package NewØvelse;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListØvelse {

    public static void main(String[] args) {
        LinkedList<String> longestString = new LinkedList<>();
        longestString.add("Godmorgen");
        longestString.add("hej");
        longestString.add("du er sød");
        longestString.add("KæmpeKyklopen");
        longestString.add("KæmpeKyklopen");

        System.out.println(longestString);
        System.out.println(longest(longestString));
    }

    public static String longest(LinkedList<String> list) {
        Iterator<String> itr = list.iterator();
        String longest = itr.next();
        while(itr.hasNext()) {
            String current = itr.next();
            if (current.length()>longest.length()) {
                longest = current;
            }
        }
        return longest;
    }
}
