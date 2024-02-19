package EksamensOpgaver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamQuestion {
    Random gen = new Random();
    int number;
    char grade;

    public ExamQuestion(int number) {
        this.number = number;
        setGrade();
    }

    public char setGrade() {
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
        grade = grades[gen.nextInt(grades.length)];
        return grade;
    }

    public String toString() {
        return "Spørgsmål " + number + ", " + grade;
    }

    public static void main(String[] args) {
        ArrayList<ExamQuestion> exam = new ArrayList();
        /*ExamQuestion e = new ExamQuestion();
        System.out.println(e.setGrade());*/

        for (int i = 0; i<=14; i++) {
            exam.add(new ExamQuestion(i+1));
        }
        for (ExamQuestion ex: exam) {
            System.out.println(ex);
        }

        writeToFile("questions.txt", exam);
    }

    private static void writeToFile(String fileName, List<ExamQuestion> exam) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (ExamQuestion question : exam) {
                writer.println(question);
            }
            System.out.println("Spørgsmål er skrevet til filen: " + fileName);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
