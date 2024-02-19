package Øvelse;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student1 {
    String name;
    int age;
    ArrayList<Double> grades = new ArrayList<>();

    public void addGrade(double karakter) {
        grades.add(karakter);
    }

    public static void main(String[] args) {
        Student1 s = new Student1();
        s.addGrade(02);
        s.addGrade(7);
        s.addGrade(12);
        System.out.println(s.grades);
        System.out.println(s.calculateAverageGrade());
        System.out.println(s.hasPassed());
    }

    public double calculateAverageGrade() {
        double totalgrades = 0;

        for (double sum : grades) {
            totalgrades+= sum;
        }
        return totalgrades/grades.size();
    }
    public boolean hasPassed() {
        return calculateAverageGrade()>02;
    }
}
