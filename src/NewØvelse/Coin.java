package NewØvelse;

import java.util.ArrayList;

public class Coin {

    public static void main(String[] args) {
        ArrayList<String> doesContain = new ArrayList<>();
        doesContain.add("Hej");
        doesContain.add("dav");
        System.out.println(doesContainString(doesContain, "Hej"));

    }

    public static boolean doesContainString(ArrayList<String> arr, String str) {
        if (!arr.contains(str)) {
            arr.add(str);
            return false;
        }
        else System.out.println("The string has been found");

        return true;
    }
}
