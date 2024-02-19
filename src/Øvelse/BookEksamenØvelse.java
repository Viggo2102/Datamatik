package Øvelse;

import java.util.ArrayList;

public class BookEksamenØvelse {

}

class Book1 {
    int nrOfPages;
    String author;

    Book1(int nrOfPages, String author) {
        this.nrOfPages = nrOfPages;
        this.author = author;
    }

    public static void main(String[] args) {
        ArrayList<Book1> list = new ArrayList<>();
        Book1 b1 = new Book1(150, "Tolkien");
        Book1 b2 = new Book1(250, "George RR Martin");

        list.add(b1);
        list.add(b2);

        Bookstore bookstore = new Bookstore(list);

        bookstore.printAveragePages();

    }
}

class Bookstore {
    ArrayList<Book1> books = new ArrayList<>();

    Bookstore(ArrayList<Book1> b) {
        books = b;
    }
    public void printAveragePages() {
        int sum = 0;
        for (Book1 b: books) {
            sum += b.nrOfPages;
        }
        System.out.println(sum/books.size());
    }
}
class Biography extends Book1 {

    Biography(int nr, String author) {
        super(nr,author);
    }
}
