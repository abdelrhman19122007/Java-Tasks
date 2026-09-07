public class EBook extends Book {
    private double fileSize;

    public EBook(String title, String author, String isbn, double price, double fileSize) {
        super(title, author, isbn, price);
        this.fileSize = fileSize;
    }

    public double getFileSize() { return fileSize; }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: E-Book | File Size: " + fileSize + " MB");
    }
}