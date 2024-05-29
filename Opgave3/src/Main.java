import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("W O W", "Lars Larson", false);
        Book book2 = new Book("What a great Pie", "Kim Kimson", false);
        Book book3 = new Book("100 facts about chickens", "Dude Dudeson", false);
        Book book4 = new Book("Easy Cheap Food", "Rebecca Rebeccason", false);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        ArrayList<Book> books = new ArrayList<>();
        User student = new User("Lasse", 10, books);

        library.borrowBook(book1, student);
        library.borrowBook(book1, student);
        library.borrowBook(book3, student);

        System.out.println(student.getBorrowedBooks());

        System.out.println("\n" + library.books);

        library.returnBook(book3, student);

        System.out.println("\n" + student.getBorrowedBooks());

        System.out.println("\n" + library.books);



    }
}