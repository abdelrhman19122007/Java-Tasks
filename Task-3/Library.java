import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayAllBooks() {
        System.out.println("\n========== LIBRARY CATALOG ==========");
        for (Book book : books) {
            book.displayInfo();
            System.out.println("------------------------------------");
        }
    }
}