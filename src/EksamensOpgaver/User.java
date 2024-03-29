package EksamensOpgaver;

import java.util.ArrayList;
import java.util.Collections;

class User implements Comparable<User> {
    String name;

    public User(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }

    public int compareTo(User o) {
        return name.compareTo(o.name);
    }

}

class Main5 {
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();

        for ( int i= 0; i<5; i++) {
            String name = "bruger" + (i+1);
            user.add(new User(name));
        }

        user.get(0).name = "Hans";
        System.out.println(user);
        user.remove(2);
        System.out.println(user);
        user.set(0, new User("Poul")); //Erstatter nummer 1.

        Collections.sort(user);
        System.out.println(user);


    }
}
