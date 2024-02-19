package Øvelse;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExceptionsOvelse {
    public static void main(String[] args) {
        System.out.println("Punkt A");
        try {
            ArrayList l = new ArrayList();
            System.out.println("Punkt B");
            l.get(2);
            System.out.println("Punkt C");
            System.out.println("Punkt g");
        }
        catch(Exception e) {
            System.out.println("Det er opstået en Exception");
            e.printStackTrace();
        }
        System.out.println("Punkt D");
    }
}
