//ArrayListSkriv en metode
// med navnet doesArraylistContainString,
// dermodtager 2parametrer: enarraylisteog enstreng.
// Metoden returnerer en boolean:•
// Hvis strengen ikke findes iarraylistenindsættes strengen
// i listen og metoden returnerer false•Hvis strengen findes i arraylisten
// returnerer metodentrue og printer ”The String has been found


import java.util.ArrayList;

public class ArraylistOvelse {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        doesArrayListContainString(list, "Godmorgen");
        doesArrayListContainString(list, "Halløj");
        System.out.println(doesArrayListContainString(list, "Godmorgen"));
        System.out.println(list);

        for (String s: list) {
            System.out.println(s);
        }
    }

    public static boolean doesArrayListContainString(ArrayList<String> arr, String hej) {
        if (!arr.contains(hej)) {
            arr.add(hej);
            return false;
        }
        else System.out.println("The String has been found");
        return true;
    }



}
