package Øvelse;

import java.awt.print.Book;
import java.util.ArrayList;

public class Librarymember {
    String name;
    int membershipID;
    ArrayList<Book> books = new ArrayList<>();

    public void borrowBook(Book libraryBook) {
        books.add(libraryBook);
    }

    public void returnBook(Book librarybook) {
        books.remove(librarybook);

    }
    public int getBooksBorrowdCount() {
     return books.size();
    }
}

class book {

}
