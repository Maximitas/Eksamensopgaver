import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book, User student) {
        if(books.contains(book) && !book.getBorrowed()) {
        student.borrowBook(book);
        book.setBorrowed(true);
        }
    }

    public void returnBook(Book book, User student) {
        if(student.borrowedBooks.contains(book)) {
            student.returnBook(book);
            book.setBorrowed(false);
        }
    }
}
