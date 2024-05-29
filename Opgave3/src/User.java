import java.util.ArrayList;

public class User {
    String name;
    int usernumber;
    ArrayList<Book> borrowedBooks;


    public User (String name, int usernumber, ArrayList<Book> borrowedBooks) {
        this.name = name;
        this.usernumber = usernumber;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUsernumber() {
        return usernumber;
    }

    public void setUsernumber(int usernumber) {
        this.usernumber = usernumber;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);

    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public String toString() {
        return "Number: " + usernumber + "\nName: " + name;
    }
}


