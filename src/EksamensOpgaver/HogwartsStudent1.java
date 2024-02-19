package EksamensOpgaver;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent1 implements Comparable<HogwartsStudent1> {
    String firstName;
    String lastName;
   String house;

    public HogwartsStudent1(String firstName, String lastName, String house) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.house = house;
    }

    public int compareTo(HogwartsStudent1 o) {
        return lastName.compareTo(o.lastName);
    }

    public String toString() {
        return firstName + " " + lastName + " " + house;
    }

    public void setHouse(String h) throws Exception {
        if (h.equals("Gryffindor") || h.equals("Slytherin") || h.equals("Hufflepuff") || h.equals("Ravenclaw") ) {
            house =h;
            System.out.println("Du har fået" + house);
        } else throw new Exception("Ikke et hus venne");
    }
}

class Hogwarts1 {
    public static void main(String[] args) {
        ArrayList<HogwartsStudent1> list = new ArrayList<>();
        list.add(new HogwartsStudent1("Harry", "Christensen", "Gryffindor"));
        list.add(new HogwartsStudent1("Luna", "Bentsen", "Hufflepuff"));
        list.add(new HogwartsStudent1("Malfoy", "Andersen", "Slytherin"));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        try {
            list.get(0).setHouse("Gryffindor");
            list.get(1).setHouse("Hufflepuff");
            list.get(2).setHouse("Gryffindorrr");
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
