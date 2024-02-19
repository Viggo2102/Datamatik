package Øvelse;

import java.util.ArrayList;
import java.util.List;

    class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public class ArrayListObjectStreamExample {
        public static void main(String[] args) {
            // Creating an ArrayList of Person objects
            List<Person> peopleList = new ArrayList<>();
            peopleList.add(new Person("Alice", 25));
            peopleList.add(new Person("Bob", 30));
            peopleList.add(new Person("Charlie", 22));

            // Using stream to filter and print people aged 25 and older
            peopleList.stream()
                    .filter(person -> person.getAge() >= 25)
                    .forEach(System.out::println);
        }
    }

