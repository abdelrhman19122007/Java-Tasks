public class PrintedBook extends Book {
    private int numberOfPages;

    public PrintedBook(String title, String author, String isbn, double price, int numberOfPages) {
        super(title, author, isbn, price);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() { return numberOfPages; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Printed Book | Pages: " + numberOfPages);
    }
}