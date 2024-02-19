package Øvelse;

import java.util.ArrayList;
import java.util.Collections;

public class Eksamensøvelse {
    public static void main(String[] args) {
        Eksamensøvelse e = new Eksamensøvelse();
        int hej = e.setrandomNr();
        System.out.println(hej);

        for (int i = 0; i<10; i++) {
            System.out.println(e.setrandomNr());
        }
        for (int i = 0; i<=10; i++) {
            int rnn = (int) (Math.random() *10) +1;
            System.out.println(rnn);
        }
    }

        public int setrandomNr () {
        return (int) (Math.random() * 10) + 1;
        }
    }

/*class User implements Comparable<User> {
    String name;

    User(String name) {
    this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(User o) {
        return name.compareTo(o.name);
    }
}


class Main9 {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();

        for (int i = 1; i<=5; i++) {
            String name = "bruger";
            userList.add(new User(name + i));
        }
        System.out.println(userList);
        userList.getFirst().name = "Hans";
        System.out.println(userList);
        Collections.sort(userList);
        System.out.println(userList);
        userList.remove(4);
        System.out.println(userList);
        userList.set(0, new User("Poul"));
        System.out.println(userList);
    }
}*/

/*abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;

    }
    public abstract String makeSound();
}

class Dog extends Animal {

Dog (String name) {
    super(name);
}

public String makeSound() {
    return name + "voof";
}

}
class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    public String makeSound() {
        return name + "miaw";
    }

}

class Main11 {
    public static void main(String [] Args) {
        ArrayList<Animal> a = new ArrayList<>();
        a.add(new Dog("Rollo"));
        a.add(new Dog("Mivser"));
        a.add(new Dog("Buller"));
        a.add(new Cat("KitKat"));
        a.add(new Cat("Else"));
        a.add(new Cat("Camilla"));
        Animal dog1 = new Dog("Basse");
        a.add(dog1);

        System.out.println(a);
        for (Animal an: a) {
            System.out.println(an.makeSound());
        }

    }
}*/
/*class Artikelll {

String body;
String header;
String author;

Artikelll(String body, String header, String author) {
    this.body = body;
    this.header = header;
    this.author = author;
}

public String toString() {
    return body + header + author;
}

public String getLongestWord() {
    String longestWord = "";
    String [] words = body.split(" ");

    for (int i = 0; i<words.length; i++) {
        if (longestWord.length()<words[i].length()) {
        longestWord = words[i];
        }
    }
    return longestWord;
    }

    public ArrayList<String> getWords() {
    ArrayList<String> result = new ArrayList<>();
    String [] ord = body.split(" ");
        for (int i = 0; i<ord.length; i++) {
            if (!result.contains(ord[i])) {
                result.add(ord[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Artikelll a = new Artikelll("Hej emd i i i jrg kefehdfuig dfg", "fuck hvor hygge", "Viktor");
        System.out.println(a);
        System.out.println(a.getLongestWord());
        System.out.println(a.getWords());
}
}*/



