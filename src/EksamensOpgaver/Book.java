package EksamensOpgaver;

import java.util.ArrayList;

public class Book {
    public int numberOfPages;
    String author;

    Book (int nr, String author) {
        this.numberOfPages = nr;
        this.author = author;
    }

    // main er extra, ikke en del af opgaven
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book(10, "John Travolta");
        Book book2 = new Book(200, "Steven");

        books.add(book1);
        books.add(book2);


        BookStore bookStore = new BookStore(books);

        bookStore.printAvgNumberOfPages();

    }
}

class BookStore {
    ArrayList<Book> bookss = new ArrayList<>();

    BookStore (ArrayList<Book> newBooks) {
        bookss  = newBooks;
    }

    public void printAvgNumberOfPages() {
        int sum = 0;
        for (Book book: bookss) {
            sum += book.numberOfPages;
        }
        int nrOfBooks = bookss.size();
        System.out.println(sum/nrOfBooks);
    }
}

class Biography extends Book {
    String mainCharacter;

    Biography(int nr, String author) {
        super(nr, author);
    }
}
