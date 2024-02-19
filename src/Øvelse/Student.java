package Øvelse;

import java.util.ArrayList;

public class Student {
    String name;
    ArrayList<Double> grades = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }


    public void addGrades(double grade) throws Exception {
        if (grades.size() >= 5) {
            throw new Exception("Ikke mere end 5 karakterer ven");
        }
        if (grade == 0 || grade == 02 || grade == 4 || grade == 7 || grade == 10 || grade == 12) {
            grades.add(grade);
        } else throw new Exception("Skal være et tal på 7 trinsskalaen");
    }

    public void gennemSnit() {
        double sum = 0;
        for (double grades: grades) {
            sum+=grades;
        }
        double gns = sum/grades.size();
        System.out.println("Gennemsnit: "+ gns);
    }

    public void printInfo() {
        System.out.println("Navn " + name + " Alle karakterer: " + grades);
    }

    public static void main(String[] args) throws Exception {
        Student s = new Student("Erik");
        try {
            s.addGrades(10);
            s.addGrades(7);
            s.addGrades(12);
            s.addGrades(4);
            s.addGrades(7);
            s.printInfo();
            s.gennemSnit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}