public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book ebook = new EBook("Clean Code", "Robert C. Martin", "12345", 29.99, 5.2);
        Book printedBook = new PrintedBook("Java Programming", "Herbert Schildt", "67890", 49.99, 720);

        library.addBook(ebook);
        library.addBook(printedBook);

        library.displayAllBooks();
    }
}